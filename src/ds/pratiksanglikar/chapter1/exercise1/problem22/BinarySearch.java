/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem22;

import java.util.Arrays;

import ds.pratiksanglikar.lib.StdOut;

/**
 * contains the methods to useful for BinarySearch.
 * @author Pratik Sanglikar
 */
public class BinarySearch {

	/**
	 * gives the rank of the key in given array.
	 * 
	 * @param array sorted array of numbers
	 * @param key to be found.
	 * @return rank of the key in the array.
	 * 			-1 if not found.
	 */
	public static int rank(int[] array, int key) {
		Arrays.sort(array);
		return rank(array, 0, array.length, key, 0);
	}

	/**
	 * Recursive function rank() that finds the rank of the key in the array.
	 * Prints the currently searching array indented according to depth.
	 *  
	 * @param array array of numbers
	 * @param low lowest index from which the key is to be searched.
	 * @param high highest index till which the key is to be searched.
	 * @param key to be found.
	 * @param depth depth of recursion.
	 * @return
	 */
	private static int rank(int[] array, int low, int high, int key, int depth) {
		if(high <= low) {
			return -1;
		}
		printArray(array, low, high, depth);
		int mid = (low + high) / 2;
		if(key < array[mid]) {
			return rank(array, low, mid, key, ++depth);
		} else if(key > array[mid]) {
			return rank(array, mid + 1, high, key, ++depth);
		} else {
			return mid;
		}
	}

	/**
	 * Prints the array from low index to high index indented with depth given.
	 * 
	 * @param array of numbers to be printed.
	 * @param low lowest index to print from
	 * @param high highest index to print till
	 * @param depth of indentation.
	 */
	private static void printArray(int[] array, int low, int high, int depth) {
		StdOut.println();
		for (int localDepth = 0; localDepth < depth; localDepth++) {
			StdOut.print("-");
		}
		for (int i = low; i < high; i++) {
			StdOut.print(" " + array[i]);
		}
	}

	/**
	 * Abstract API to print an array without callee having to deal with 
	 * complexities involved in overloaded function.
	 * 
	 * @param array to be printed.
	 */
	public static void printArray(int[] array) {
		printArray(array, 0, array.length, 0);
	}
}
