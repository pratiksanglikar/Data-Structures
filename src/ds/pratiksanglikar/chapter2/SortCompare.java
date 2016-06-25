/**
 * 
 */
package ds.pratiksanglikar.chapter2;

import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;
import ds.pratiksanglikar.lib.Stopwatch;

/**
 * Class for comparison of various sorting strategies.
 * 
 * @author Pratik Sanglikar
 */
public class SortCompare {

	private static Sort sortingStrategy;

	/**
	 * Measures the time required for Sorting the array with specified algorithm.
	 * 
	 * @param algorithm to be used to sort the array.
	 * @param array to be sorted.
	 * @return time required to sort the array.
	 */
	private static double measureTimeForSorting(String algorithm, Double[] array) {
		Stopwatch timer = new Stopwatch();
		if (algorithm.equalsIgnoreCase("Insertion")) {
			sortingStrategy = new Insertion();
		} else if (algorithm.equalsIgnoreCase("Selection")) {
			sortingStrategy = new Selection();
		} else if(algorithm.equalsIgnoreCase("Shell")) {
			sortingStrategy = new Shell();
		} else if(algorithm.equalsIgnoreCase("Merge")) {
			sortingStrategy = new Merge();
		} else {
			throw new RuntimeException("Unknown sorting strategy.");
		}
		sortingStrategy.sort(array);
		return timer.elapsedTime();
	}

	/**
	 * Measures the time required for a sorting numberOfArrays with arrayLength using specified algorithm.
	 * 
	 * @param algorithm to be used to sort the random arrays.
	 * @param arrayLength length of each array.
	 * @param numberOfArrays total number of arrays.
	 * @return time required to sort all arrays.
	 */
	public static double measureTimeForAlgoOnRandomInput(String algorithm, int arrayLength, int numberOfArrays) {
		double total = 0.0;
		Double[][] randomInput = generateRandomInput(numberOfArrays, arrayLength);
		for (int i = 0; i < numberOfArrays; i++) {
			total += measureTimeForSorting(algorithm, randomInput[i]);
		}
		return total;
	}

	/**
	 * generates numberOfArrays of size arraySize with random double numbers.
	 * 
	 * @param numberOfArrays to be generated.
	 * @param arraySize size of each array.
	 * @return arrays generated of random input.
	 */
	public static Double[][] generateRandomInput(int numberOfArrays, int arraySize) {
		Double[][] randomInput = new Double[numberOfArrays][arraySize];
		for (int i = 0; i < numberOfArrays; i++) {
			for (int j = 0; j < arraySize; j++) {
				randomInput[i][j] = StdRandom.uniform();
			}
		}
		return randomInput;
	}

	/**
	 * <pre>
	 * main entry point of the program.
	 * 
	 * @param args command line arguments,
	 * 			1. First algorithm to compare
	 * 			2. Second algorithm to compare.
	 * 			3. number of arrays to compare.
	 * 			4. length of each array. </pre>
	 */
	public static void main(String[] args) {
		if (args.length != 4) {
			throw new RuntimeException("Unsupported number of arguments. Expected: 4, Received: " + args.length);
		}
		String algorithm1 = args[0];
		String algorithm2 = args[1];
		int arrayLength = Integer.parseInt(args[3]);
		int numberOfArrays = Integer.parseInt(args[2]);
		double t1 = measureTimeForAlgoOnRandomInput(algorithm1, arrayLength, numberOfArrays);
		double t2 = measureTimeForAlgoOnRandomInput(algorithm2, arrayLength, numberOfArrays);
		StdOut.printf("For %d random Doubles\n    %s is", arrayLength, algorithm1);
		StdOut.printf(" %.1f times faster than %s\n", t2 / t1, algorithm2);
	}
}
