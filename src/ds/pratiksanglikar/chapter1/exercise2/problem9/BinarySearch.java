/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise2.problem9;

import ds.pratiksanglikar.lib.StdOut;

/**
 * Binary Search imeplementation.
 * 
 * @author Pratik Sanglikar
 */
public class BinarySearch {

	/**
	 * Non-recursive binary search implementation with counter of number of keys
	 * compared.
	 * 
	 * @param array
	 *            in which the key is to be searched.
	 * @param key
	 *            to be searched.
	 * @param count
	 *            of total keys compared.
	 * @return rank of the key in the array.
	 */
	public static int rank(int[] array, int key, int count) {
		int low = 0, high = array.length - 1, mid = 0, rank = -1;

		while (low <= high) {
			count++;
			mid = (high + low) / 2;
			if (key > array[mid]) {
				low = mid + 1;
			} else if (key < array[mid]) {
				high = mid;
			} else if (array[mid] == key) {
				rank = mid;
				break;
			} else {
				break;
			}
		}
		StdOut.println("\nNumber of keys compared: " + count);
		return rank;
	}
}
