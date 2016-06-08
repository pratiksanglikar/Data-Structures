/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem5;

/**
 * Chapter 1, Exercise 1, Problem 5
 * 
 * Write a code fragment that prints true if the double variables x and y are both 
 * strictly between 0 and 1 and false otherwise.
 * 
 * @author Pratik Sanglikar
 */
public class Exercise1Problem5 {

	/**
	 * Main entry point of the program.
	 * Accepts two command line arguments.
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		if(args.length != 2) {
			throw new RuntimeException("Number of command line arguments accepted: 2, got: " + args.length);
		}
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		System.out.println(checkBoundry(x) && checkBoundry(y));
	}

	/**
	 * function that checks if the provided number is strictly between 0 and 1.
	 * @param number to be checked boundaries of 
	 * @return	'true' if number is strictly between 0 and 1
	 * 			'false' if the number is not between 0 and 1
	 */
	private static boolean checkBoundry(double number) {
		if(number >= 0.00 && number <= 1.00) {
			return true;
		}
		return false;
	}
}
