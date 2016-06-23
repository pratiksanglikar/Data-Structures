/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem16;

import java.util.Arrays;

/**<pre>
 * Chapter 2, Exercise 1, Problem 16
 * 
 * Certification.
 * Write a check() method that calls sort() for a given array 
 * and returns true if sort() puts the array in order and leaves 
 * the same set of objects in the array as were there initially, 
 * false otherwise. 
 * 
 * Do not assume that sort() is restricted to move data only with exch(). 
 * You may use Arrays.sort() and assume that it is correct.
 * 
 * @author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise1Problem16 {

	/**
	 * checks if all the elements in array are same after sorting them
	 * 
	 * @param array to be sorted.
	 * @return	'true' if all elements are same after sorting
	 * 			'false' otherwise
	 */
	@SuppressWarnings("rawtypes")
	public static boolean check(Comparable[] array) {
		Comparable[] tempArray = new Comparable[array.length];
		tempArray = Arrays.copyOf(array, array.length);
		Arrays.sort(array);
		boolean sameArray = true;
		for (int i = 0; i < array.length; i++) {
			boolean isSameObject = false;
			for (int j = 0; j < tempArray.length; j++) {
				if(array[i].equals(tempArray[j])) {
					isSameObject = true;
				}
			}
			if(!isSameObject) {
				sameArray = false;
				break;
			}
		}
		return sameArray;
	}
}
