/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem30;

import ds.pratiksanglikar.lib.StdOut;

/**
 * Chapter 1, Exercise 1, Problem 30
 * 
 * Array exercise. Write a code fragment that creates an N-by-N boolean array
 * a[][] such that a[i][j] is true if i and j are relatively prime (have no
 * common factors), and false otherwise.
 * 
 * @author Pratik Sanglikar
 */
public class Exercise1Problem30 {

	/**
	 * main entry point of the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			throw new RuntimeException("Number of command line arguments accepted: 1, got: " + args.length);
		}
		int n = Integer.parseInt(args[0]);
		boolean[][] relativePrimeArray = new boolean[n][n];
		calculateRelativePrimeArray(relativePrimeArray);
		printRelativePrimeArray(relativePrimeArray);
	}

	/**
	 * for a given N-by-N matrix, the function fills the matrix such that
	 * for each i and j, the value is true if i and j are relatively prime
	 * false otherwise.
	 * 
	 * @param relativePrimeArray
	 */
	private static void calculateRelativePrimeArray(boolean[][] relativePrimeArray) {
		int n = relativePrimeArray.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				relativePrimeArray[i][j] = areRelativePrimeNumbers(i, j);
			}
		}
	}

	/**
	 * checks whether the number1 and number2 are relatively prime.
	 * 
	 * @param number1
	 * @param number2
	 * @return are the number1 and number2 relatively prime?
	 */
	private static boolean areRelativePrimeNumbers(int number1, int number2) {
		if (gcd(number1, number2) == 1) {
			return true;
		}
		return false;
	}

	/**
	 * prints the relativePrimeArray.
	 * 
	 * @param relativePrimeArray to be printed.
	 */
	private static void printRelativePrimeArray(boolean[][] relativePrimeArray) {
		int n = relativePrimeArray.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				StdOut.print("\t" + relativePrimeArray[i][j]);
			}
			StdOut.println();
		}
	}

	/**
	 * returns the greatest common divisor (GCD) using euclid's algorithm.
	 * 
	 * @param number1
	 * @param number2
	 * @return GCD of number1 and number2
	 */
	public static int gcd(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		int remainder = number1 % number2;
		return gcd(number2, remainder);
	}
}
