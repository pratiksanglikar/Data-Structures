/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem22;

import java.util.Arrays;

import ds.pratiksanglikar.lib.StdOut;

/**
 * @author Pratik Sanglikar
 *
 */
public class BinarySearch {

	public static int rank(int[] array, int key) {
		Arrays.sort(array);
		return rank(array, 0, array.length, key, 0);
	}

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

	private static void printArray(int[] array, int low, int high, int depth) {
		StdOut.println();
		for (int localDepth = 0; localDepth < depth; localDepth++) {
			StdOut.print("-");
		}
		for (int i = low; i < high; i++) {
			StdOut.print(" " + array[i]);
		}
	}

	public static void printArray(int[] array) {
		printArray(array, 0, array.length, 0);
	}
}
