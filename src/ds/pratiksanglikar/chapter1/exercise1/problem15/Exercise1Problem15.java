/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem15;

import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * Chapter 1, Exercise 1, Problem 15
 * 
 * Write a static method histogram() that takes an array a[] of integer values 
 * and an integer M as arguments and returns an array of length M whose ith entry 
 * is the number of times the integer i appeared in the argument array. 
 * If the values in a[] are all between 0 and M–1, the sum of the values in the
 * returned array should be equal to a.length.
 * 
 * @author Pratik Sanglikar
 */
public class Exercise1Problem15 {

	/**
	 * the main entry point of the program.
	 * accepts one command line argument - 'M' in the problem statement.
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		if(args.length != 1) {
			throw new RuntimeException("Number of command line arguments accepted: 1, got: " + args.length);
		}
		int m = Integer.parseInt(args[0]);
		int[] inputArray = initializeRandomInputArray();
		StdOut.println("\nRandom input array: ");
		printArray(inputArray);
		int[] histogram = Histogram.histogram(inputArray, m);
		StdOut.println("\nHistogram: ");
		printArray(histogram);
	}
	
	/**
	 * prints the array.
	 * @param array
	 */
	private static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			StdOut.print(" " + array[i]);
		}
	}

	/**
	 * initializes the input array in the problem statement with random 
	 * length and random values between 0 and 100.
	 * @return inputArray.
	 */
	private static int[] initializeRandomInputArray() {
		int randomLength = StdRandom.uniform(100);
		int[] inputArray = new int[randomLength];
		for(int i = 0; i < randomLength; i++) {
			inputArray[i] = StdRandom.uniform(100);
		}
		return inputArray;
	}
}