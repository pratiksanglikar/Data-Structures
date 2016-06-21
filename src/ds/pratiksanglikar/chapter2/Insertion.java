/**
 * 
 */
package ds.pratiksanglikar.chapter2;

/**
 * Insertion Sort implementation for sorting.
 * 
 * @author Pratik Sanglikar
 */
public class Insertion implements Sort{

	/**
	 * Sort the provided array with Insertion sort.
	 * 
	 * @param array to be sorted.
	 */
	@SuppressWarnings("rawtypes")
	public void sort(Comparable[] array) {
		int arrayLength = array.length;
		for (int i = 1; i < arrayLength; i++) {
			for (int j = i; j > 0 && SortingUtilities.isLesser(array[j], array[j - 1]); j--) {
				SortingUtilities.exchange(array, j, j - 1);
			}
		}
	}
}
