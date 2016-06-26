/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise2.problem8;

import ds.pratiksanglikar.chapter2.SortingUtilities;

/**
 * <pre>
 * Chapter 2, Exercise 2, Problem 8
 * 
 * Suppose that Algorithm 2.4 is modified to skip the call on merge() 
 * whenever a[mid] <= a[mid+1]. Prove that the number of compares used
 * to merge sort a sorted array is linear.
 * 
 * @author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise2Problem8 {

	private int compares;

	/**
	 * sorts the array using merge sort and counts the compares required 
	 * for sorting.
	 * 
	 * @param array to be sorted.
	 * @return count of compares required to sort array.
	 */
	@SuppressWarnings("rawtypes")
	public int sortAndCountCompares(Comparable[] array) {
		int arraySize = array.length;
		Comparable[] auxilary = new Comparable[arraySize];
		sortAndcountCompares(array, auxilary, 0, arraySize - 1);
		return compares;
	}

	/** <pre>
	 * Recursive merge sort algorithm
	 * uses the optimization to merge only 
	 * {@code if(array[mid] < array[mid+1])}
	 *  
	 * @param array to be sorted.
	 * @param auxilary required for storing intermediate operation.
	 * @param low lower bound of subarray
	 * @param high higher bound of subarray
	 * </pre>
	 */
	@SuppressWarnings("rawtypes")
	private void sortAndcountCompares(Comparable[] array, Comparable[] auxilary, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		sortAndcountCompares(array, auxilary, low, mid);
		sortAndcountCompares(array, auxilary, mid + 1, high);
		if (SortingUtilities.isLesser(array[mid + 1], array[mid])) {
			merge(array, auxilary, low, mid, high);
		}
	}

	/**
	 * Merges the two subarrays.
	 * 
	 * @param array to be sorted.
	 * @param auxilary array of intermediate values.
	 * @param low lower bound of array.
	 * @param mid mid of subarray
	 * @param high higher bound of subarray.
	 */
	@SuppressWarnings("rawtypes")
	private void merge(Comparable[] array, Comparable[] auxilary, int low, int mid, int high) {
		int i = low;
		int j = mid;
		for (int k = low; k < high; k++) {
			auxilary[k] = array[k];
		}
		for (int k = low; k < high; k++) {
			if (i >= mid) {
				array[k] = auxilary[j++];
			} else if (j >= high) {
				array[k] = auxilary[i++];
			} else {
				compares++;
				if (SortingUtilities.isLesser(array[j], array[i])) {
					array[k] = auxilary[j++];
				} else {
					array[k] = auxilary[i++];
				}
			} 
		}
	}
}
