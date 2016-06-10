/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem9;

/**
 * Chapter 1, Exercise 1, Problem 9
 * Write a code fragment that puts the binary representation of a positive integer N 
 * into a String s. 
 * @author Pratik Sanglikar
 */
public class Ch1Exercise1Problem9 {

	/**
	 * Main entry point of the program.
	 * Accepts one command line arguments.
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		if(args.length != 1) {
			throw new RuntimeException("Number of command line arguments accepted: 1, got: " + args.length);
		}
		int number = Integer.parseInt(args[0]);
		System.out.println(convertToBinaryString(number));
		// Alternate approach - Interger.toBinaryString(number);
	}

	/**
	 * function that converts the positive integer number into it's binary string 
	 * representation
	 * @param number to be converted.
	 * @return converted binary string representation of the number.
	 */
	private static String convertToBinaryString(int number) {
		StringBuilder binaryString = new StringBuilder("");
		for(int n = number; n > 0; n /= 2) {
			binaryString.insert(0, n % 2); // insert the remainder at the beginning of the string.
		}
		// Alternative approach, use PushDownStackLL<Integer>
		return binaryString.toString();
	}
}