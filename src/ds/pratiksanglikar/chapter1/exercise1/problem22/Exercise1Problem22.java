/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem22;

import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * Chapter 1, Exercise 1, Problem 22
 * 
 * Write a version of Binary Search that uses the recursive rank() given on page
 * 25 and traces the method calls. Each time the recursive method is called,
 * print the argument values lo and hi, indented by the depth of the recursion.
 * Hint: Add an argument to the recursive method that keeps track of the depth.
 * 
 * @author Pratik Sanglikar
 */
public class Exercise1Problem22 {

	/**
	 * The main entry point of the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {
		int[] inputArray = initializeRandomArray();
		StdOut.println("\nInput array: ");
		BinarySearch.printArray(inputArray);
		int key = getRandomKey();
		StdOut.println("\n\nKey: " + key);
		int rank = BinarySearch.rank(inputArray, key);
		StdOut.println("\n\nRank: " + rank);
	}

	/**
	 * @return
	 */
	private static int getRandomKey() {
		return StdRandom.uniform(1, 104);
	}

	/**
	 * @return
	 */
	private static int[] initializeRandomArray() {
		int[] inputArray = new int[25];
		for (int i = 0; i < 25; i++) {
			int randomNumber = StdRandom.uniform(i * 4, (i + 1) * 4);
			inputArray[i] = randomNumber;
		}
		return inputArray;
	}
}
