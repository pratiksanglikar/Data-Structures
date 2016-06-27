/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise2.problem10;

import ds.pratiksanglikar.chapter2.Sort;
import ds.pratiksanglikar.chapter2.SortingUtilities;

/**
 * <pre>
 * Chapter 2, Exercise 2, Problem 10
 * 
 * <b>Faster merge.</b>
 * Implement a version of merge() that copies the second half 
 * of a[] to aux[] in decreasing order and then does the merge 
 * back to a[]. 
 * 
 * This change allows you to remove the code to test that each 
 * of the halves has been exhausted from the inner loop. 
 * Note: The resulting sort is not stable (see page 341)
 * 
 * &#64;author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise2Problem10 implements Sort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds.pratiksanglikar.chapter2.Sort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] array) {
		Comparable[] auxilary = new Comparable[array.length];
		sort(array, auxilary, 0, array.length - 1);
	}

	/**
	 * Recursive Merge Sort.
	 * 
	 * @param array
	 *            to be sorted
	 * @param auxilary
	 *            array to store intermediate values.
	 * @param low
	 *            lower bound of subarray.
	 * @param high
	 *            higher bound of subarray
	 */
	@SuppressWarnings("rawtypes")
	private void sort(Comparable[] array, Comparable[] auxilary, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		sort(array, auxilary, low, mid);
		sort(array, auxilary, mid + 1, high);
		mergeOptimized(array, auxilary, low, mid, high);
	}

	/**
	 * Merges the two sorted subarrays.
	 * 
	 * @param array
	 * @param auxilary
	 * @param low
	 * @param mid
	 * @param high
	 */
	@SuppressWarnings("rawtypes")
	private void mergeOptimized(Comparable[] array, Comparable[] auxilary, int low, int mid, int high) {
		for (int i = low; i <= mid; i++) {
			auxilary[i] = array[i];
		}

		for (int j = mid + 1; j <= high; j++) {
			auxilary[j] = array[high - j + mid + 1];
		}

		int i = low, j = high;
		for (int k = low; k <= high; k++) {
			if (SortingUtilities.isLesser(auxilary[j], auxilary[i])) {
				array[k] = auxilary[j--];
			} else {
				array[k] = auxilary[i++];
			}
		}
	}
}
