/**
 * 
 */
package ds.pratiksanglikar.chapter2;

/**
 * Bottom Up Merge Sort implementation.
 * we sort all subarrays first and then merge them together.
 * @author Pratik Sanglikar
 *
 */
public class MergeBottomUp implements Sort {

	@SuppressWarnings("rawtypes")
	private Comparable[] auxilary;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds.pratiksanglikar.chapter2.Sort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] array) {
		auxilary = new Comparable[array.length];
		int arraySize = array.length;
		for (int i = 1; i < arraySize; i += i) {
			for (int j = 0; j < arraySize - i; j += i + i) {
				merge(array, j, j + i - 1, Math.min(j + i + i - 1, arraySize - 1));
			}
		}
	}

	/**
	 * 
	 * @param array
	 * @param low
	 * @param mid
	 * @param high
	 */
	@SuppressWarnings("rawtypes")
	private void merge(Comparable[] array, int low, int mid, int high) {
		if (low >= high) {
			return;
		}
		int i = low;
		int j = mid + 1;
		for (int k = low; k <= high; k++) {
			auxilary[k] = array[k];
		}
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				array[k] = auxilary[j++];
			} else if (j > high) {
				array[k] = auxilary[i++];
			} else if (SortingUtilities.isLesser(auxilary[j], auxilary[i])) {
				array[k] = auxilary[j++];
			} else {
				array[k] = auxilary[i++];
			}
		}
	}
}
