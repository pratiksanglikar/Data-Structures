/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem11;

import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * Chapter 1, Exercise 1, Problem 11
 * 
 * Write a code fragment that prints the contents of a two-dimensional boolean
 * array, using * to represent true and a space to represent false.
 *
 * @author Pratik Sanglikar
 */
public class Ch1Exercise1Problem11 {

	private static boolean[][] twoDArray = new boolean[5][5];

	/**
	 * Main entry point of the program.
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		initialize2DArray();
		print2DArray();
	}

	/**
	 * prints the two dimensional boolean array.
	 *  '*' represents 'true' value.
	 *  ' ' represents 'false' value.
	 */
	private static void print2DArray() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(twoDArray[i][j]) {
					StdOut.print("\t*");
				} else {
					StdOut.print("\t ");
				}
			}
			StdOut.println();
		}
	}

	/**
	 * initializes the two dimensional boolean array with random 
	 * 'true' and 'false' values.
	 */
	private static void initialize2DArray() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int randomNumber = StdRandom.uniform(0, 5);
				if(randomNumber % 2 == 0) {
					twoDArray[i][j] = true;
				} else {
					twoDArray[i][j] = false;
				}
			}
		}
	}
}
