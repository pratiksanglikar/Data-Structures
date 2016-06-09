/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem20;

import ds.pratiksanglikar.lib.StdOut;

/**
 * Chapter 1, Exercise 1, Problem 20
 * 
 * Write a recursive static method that computes the value of ln( N! )
 * 
 * @author Pratik Sanglikar
 */
public class Exercise1Problem20 {
	
	private static long[] factorialCache = new long[50]; 

	/**
	 * the main entry point of the program.
	 * Accepts one command line argument - N.
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		if(args.length != 1) {
			throw new RuntimeException("Number of command line arguments accepted: 1, got: " + args.length);
		}
		int n = Integer.parseInt(args[0]);
		StdOut.println(ln(factorial(n)));
	}

	/**
	 * Recursive function to calculate factorial of given number.
	 * @param n number of which the factorial needs to be calculated.
	 * @return factorial.
	 */
	private static long factorial(int n) {
		if(n < 2) {
			return 1;
		}
		if(n <= factorialCache.length) {
			if(factorialCache[n] == 0) {
				factorialCache[n] = n * factorial(n-1);
			}
			return factorialCache[n];
		} 
		return n * factorial(n-1);
	}

	/**
	 * returns ln(n) 
	 * @param n of which the log needs to be calculated.
	 * @return ln(n)
	 */
	private static double ln(long n) {
		return Math.log(n);
	}
}
