/**
 * 
 */
package ds.pratiksanglikar.chapter2;

/**
 * MergeSort implementation of sorting algorithm.
 * 
 * @author Pratik Sanglikar
 *
 */
public class Merge implements Sort {

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
		mergeSort(array, 0, array.length - 1);
	}

	/**
	 * Recursive MergeSort imeplemtation.
	 * 
	 * @param array
	 *            to be sorted.
	 * @param low
	 *            lower bound
	 * @param high
	 *            higher bound
	 */
	@SuppressWarnings("rawtypes")
	private void mergeSort(Comparable[] array, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid + 1, high);
		merge(array, low, mid, high);
	}

	/**
	 * <pre>
	 * merges two sorted parts of an array. 
	 * Uses an auxilary array of array's size while merging.
	 * 
	 * &#64;param array to be merged.
	 * &#64;param low lower bound.
	 * &#64;param mid 
	 * &#64;param high higher bound.
	 * </pre>
	 */
	@SuppressWarnings("rawtypes")
	private void merge(Comparable[] array, int low, int mid, int high) {
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
