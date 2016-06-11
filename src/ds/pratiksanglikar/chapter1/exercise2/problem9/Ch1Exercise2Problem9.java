/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise2.problem9;

import java.util.Arrays;

import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * <pre>
 * Chapter 1, Exercise 2, Problem 9
 * 
 * Instrument Binary Search (page47) to use a Counter to count the total number
 * of keys examined during all searches and then print the total after all 
 * searches are complete. 
 * 
 * Hint : Create a Counter in main() and pass it as an argument to rank()
 * </pre>
 * 
 * @author Pratik Sanglikar
 */
public class Ch1Exercise2Problem9 {

	/**
	 * The main entry point of the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {
		int[] array = initializeArray();
		Arrays.sort(array);
		printArray(array);
		int key = array[StdRandom.uniform(0, array.length)];
		StdOut.println("\nKey: " + key);
		int count = 0;
		int rank = BinarySearch.rank(array, key, count);
		StdOut.println("Rank: " + rank);
	}

	/**
	 * initialize the integer array of random length with random integers.
	 * 
	 * @return random integer array
	 */
	private static int[] initializeArray() {
		int length = StdRandom.uniform(1, 50);
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = StdRandom.uniform(1, 100);
		}
		return array;
	}

	/**
	 * prints the provided integer array.
	 * 
	 * @param array
	 *            to be printed.
	 */
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			StdOut.print(array[i] + "\t");
		}
	}
}
