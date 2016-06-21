/**
 * 
 */
package ds.pratiksanglikar.chapter2;

import ds.pratiksanglikar.lib.StdOut;

/**
 * This class contains common utility functions required for all sorting
 * algorithms.
 * 
 * @author Pratik Sanglikar
 */
public class SortingUtilities {

	/**
	 * <pre>
	 * returns whether the first comparable item is lesser than the second comparable item.
	 * 
	 * @param first item to be compared
	 * @param second item to be compared.
	 * 
	 * @return 	'true' if the first item is lesser than the second.
	 * 	'false' otherwise
	 * </pre> 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean isLesser(Comparable first, Comparable second) {
		return (first.compareTo(second) < 0);
	}

	/**
	 * <pre>
	 * Exchanges the elements at the position i and j in the array.
	 * 
	 * @param array
	 * @param i
	 * @param j
	 * </pre>
	 */
	@SuppressWarnings("rawtypes")
	public static void exchange(Comparable[] array, int i, int j) {
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * <pre>
	 * Shows the array.
	 * 
	 * @param array to be showed.
	 * </pre>
	 */
	@SuppressWarnings("rawtypes")
	public static void show(Comparable[] array) {
		for (Comparable arrayElement : array) {
			StdOut.print("\t" + arrayElement);
		}
	}

	/**
	 * <pre>
	 * Checks if the array is sorted or not.
	 * 
	 * @param array 
	 * @return	'true' if the array is sorted.
	 * 			'false' otherwise.
	 * </pre>
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isSorted(Comparable[] array) {
		int size = array.length;
		for (int i = 0; i < size - 1; i++) {
			if (isLesser(array[i + 1], array[i])) {
				return false;
			}
		}
		return true;
	}
}
