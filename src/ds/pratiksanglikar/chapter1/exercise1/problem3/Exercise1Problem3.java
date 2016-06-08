/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem3;

/**
 * Chapter 1, Exercise 1, Problem 3
 * Write a program that takes three integer command-line arguments and prints equal 
 * if all three are equal, and not equal otherwise.
 * @author Pratik Sanglikar
 */
public class Exercise1Problem3 {

	/**
	 * Main entry point of the program.
	 * Need three command line arguments to check equality.
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		if(args.length != 3) {
			throw new RuntimeException("Number of command line arguments accepted: 3, got: " + args.length);
		}
		int number1 = 0, number2 = 0, number3 = 0;
		number1 = Integer.parseInt(args[0]);
		number2 = Integer.parseInt(args[1]);
		number3 = Integer.parseInt(args[2]);
		if(areThreeIntEqual(number1, number2, number3)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

	/**
	 * Checks if provided three numbers are equal.
	 * @param number1
	 * @param number2
	 * @param number3
	 * @return	'true' if provided three numbers are equal.
	 * 			'false' if provided three numbers are not equal.
	 */
	private static boolean areThreeIntEqual(int number1, int number2, int number3) {
		if(number1 == number2 && number2 == number3) {
			return true;
		}
		return false;
	}
}
