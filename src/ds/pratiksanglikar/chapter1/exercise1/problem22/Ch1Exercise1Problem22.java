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
public class Ch1Exercise1Problem22 {

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
	 * generates the random key to be found in the array.
	 * As we have assumed that the numbers in the array will be between 
	 * 0 and 104, the random key will be generated as a number between 0 and 104.
	 * 
	 * @return key to be found.
	 */
	private static int getRandomKey() {
		return StdRandom.uniform(1, 104);
	}

	/**
	 * initializes the random array of numbers.
	 * As we don't want duplicate keys to be present in the array, 
	 * we generate each number as randomly between a range.
	 * Thus, this function generates random, but predictable sequence of numbers 
	 * eliminating the duplicates.
	 * 
	 * @return array of semi-random numbers.  
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
