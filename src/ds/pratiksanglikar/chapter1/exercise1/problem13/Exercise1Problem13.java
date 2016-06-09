/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem13;

import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * Chapter 1, Exercise 1, Problem 13
 * 
 * Write a code fragment to print the transposition (rows and columns changed) 
 * of a two-dimensional array with M rows and N columns.
 * 
 * @author Pratik Sanglikar
 */
public class Exercise1Problem13 {
	
	private static int[][] twoDMatrix = new int[5][3];
	
	/**
	 * the main entry point of the program.
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		initialize2DMatrix();
		StdOut.println("\nRandomly generated matrix: ");
		print2DMatrix();
		StdOut.println("\nMatrix after applying transposition: ");
		printTranspose2DMatrix();
	}
	
	/**
	 * prints the transpose of the 2 dimensional matrix of the size 5 x 3.
	 */
	private static void printTranspose2DMatrix() {
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 5; i++) {
				StdOut.print("\t" + twoDMatrix[i][j]);
			}
			StdOut.println();
		}
	}

	/**
	 * prints the two dimensional integer matrix of the size 5 x 3.
	 */
	private static void print2DMatrix() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				StdOut.print("\t" + twoDMatrix[i][j]);
			}
			StdOut.println();
		}
	}

	/**
	 * initializes the two dimensional integer matrix of the size 5 x 3 with 
	 * numbers between 1 - 100
	 */
	private static void initialize2DMatrix() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				int randomNumber = StdRandom.uniform(0, 100);
				twoDMatrix[i][j] = randomNumber;
			}
		}
	}
}
