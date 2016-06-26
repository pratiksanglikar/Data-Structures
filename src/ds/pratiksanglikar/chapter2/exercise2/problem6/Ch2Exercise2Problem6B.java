/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise2.problem6;

import static ds.pratiksanglikar.chapter2.SortingUtilities.isLesser;

/**
 * <pre>
 * Chapter 2, Exercise 2, Problem 6
 * 
 * Write a program to compute the exact value of the number of 
 * array accesses used by top-down mergesort and by bottom-up 
 * mergesort. 
 * 
 * Compare the exact values with the upper bound 6NlgN.
 * 
 * This class implements Bottom-Up Merge sort required to solve this problem.
 * 
 * @author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise2Problem6B {
	int arrayAccessCount = 0;

	/**
	 * Sorts the array of comparables using top-down merge sort returns the
	 * count of array accesses.
	 * 
	 * @param array
	 *            to be sorted.
	 * @return number of array access count.
	 */
	@SuppressWarnings("rawtypes")
	public int sortAndCountArrayAccesses(Comparable[] array) {
		Comparable[] auxilary = new Comparable[array.length];
		sort(array, auxilary, 0, array.length - 1);
		return arrayAccessCount;
	}

	/**
	 * Recursive Top-Bottom Merge Sort algorithm with a count of number of array
	 * accesses.
	 * 
	 * @param array
	 *            to be sorted.
	 * @param auxilary
	 *            array to store intermediate values.
	 * @param low
	 *            lower bound of the subarray
	 * @param high
	 *            higher bound of the subarray.
	 */
	@SuppressWarnings("rawtypes")
	private void sort(Comparable[] array, Comparable[] auxilary, int low, int high) {
		for (int i = 1; i < high; i *= 2) {
			for (int l = 0; l < array.length - 1; l += i + i) {
				merge(array, auxilary, l, l + i - 1, Math.min(l + i + i - 1, array.length - 1));
			}
		}
	}

	/**
	 * merges the two sorted subarrays into one sorted array.
	 * 
	 * @param array
	 *            to be sorted.
	 * @param auxilary
	 *            required for storing intermediate operations.
	 * @param low
	 *            lower bound of subarray
	 * @param mid
	 *            mid position of the subarray
	 * @param high
	 *            higher bound of the subarray
	 */
	@SuppressWarnings("rawtypes")
	private void merge(Comparable[] array, Comparable[] auxilary, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		for (int k = low; k <= high; k++) {
			auxilary[k] = array[k];
			arrayAccessCount += 2; // for accessing auxilary and array once per
									// iteration.
		}
		for (int k = low; k <= high; k++) {
			arrayAccessCount += 2; // for copying value from auxilary to array.
			if (i > mid) {
				array[k] = auxilary[j++];
			} else if (j >= high) {
				array[k] = auxilary[i++];
			} else {
				arrayAccessCount += 2; // for comparison in next statement.
				if (isLesser(auxilary[j], auxilary[i])) {
					array[k] = auxilary[j++];
				} else {
					array[k] = auxilary[i++];
				}
			}
		}
	}
}
