/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem14;

import ds.pratiksanglikar.lib.StdOut;

/**
 * Chapter 1, Exercise 1, Problem 14
 * 
 * Write a static method lg() that takes an integer value N as argument and 
 * returns the largest integer not larger than the base-2 logarithm of N. 
 * Do not use Math.
 * 
 * @author Pratik Sanglikar
 */
public class Exercise1Problem14 {

	/**
	 * the main entry point of the program
	 * accepts one command line argument. The number 'n'
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		if(args.length != 1) {
			throw new RuntimeException("Number of command line arguments accepted: 1, got: " + args.length);
		}
		int n = Integer.parseInt(args[0]);
		StdOut.println(Logarithms.lg(n));
	}
}