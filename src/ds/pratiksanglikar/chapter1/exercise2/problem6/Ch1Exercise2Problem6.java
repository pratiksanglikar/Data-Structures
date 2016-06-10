/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise2.problem6;

import ds.pratiksanglikar.lib.StdOut;

/**
 * Chapter 1, Exercise 2, Problem 6
 * 
 * Write a program that checks whether two given strings s and t are circular shifts of one another. 
 * A string s is a circular rotation of a string t if it matches when the characters are circularly 
 * shifted by any number of positions; e.g., ACTGACG is a circular shift of TGACGAC, and vice versa. 
 * Detecting this condition is important in the study of genomic sequences.
 * 
 * @author Pratik Sanglikar
 *
 */
public class Ch1Exercise2Problem6 {

	/**
	 * the main entry point of the program.
	 * accepts two command line arguments - String1, String2 for which cirular rotation is to be checked.
	 * 
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		if(args.length != 2) {
			throw new RuntimeException("Number of command line arguments accepted: 2, got: " + args.length);
		}
		String string1 = args[0];
		String string2 = args[1];
		StdOut.println(isCircularRotation(string1, string2));
	}

	/**
	 * returns if the the string1 and string2 are circular rotation of each other. 
	 * 
	 * @param string1
	 * @param string2
	 * @return 	'true'	if the string1 and string2 are circular rotation of each other.
	 * 			'false' otherwise
	 */
	private static boolean isCircularRotation(String string1, String string2) {
		if(string1.length() != string2.length()){
			return false;
		}
		String concatenatedString = string1 + string1;
		if(concatenatedString.contains(string2)) {
			return true;
		}
		return false;
	}
}
