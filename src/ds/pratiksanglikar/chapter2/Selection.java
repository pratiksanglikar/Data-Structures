/**
 * 
 */
package ds.pratiksanglikar.chapter2;

/**
 * <pre>
 * Implementation of Selection Sort Algorithm.
 * 
 * &#64;author Pratik Sanglikar
 * </pre>
 */
public class Selection {

	/**<pre>
	 * Sorts the array.
	 * 
	 * @param array to be sorted.
	 * </pre>
	 */
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] array) {
		int arraySize = array.length;
		for (int i = 0; i < arraySize; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arraySize; j++) {
				if (SortingUtilities.isLesser(array[j], array[minIndex])) {
					minIndex = j;
				}
			}
			SortingUtilities.exchange(array, i, minIndex);
		}
	}
}
