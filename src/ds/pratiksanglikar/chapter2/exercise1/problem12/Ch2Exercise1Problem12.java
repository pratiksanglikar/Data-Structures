/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem12;

import ds.pratiksanglikar.chapter2.Sort;
import ds.pratiksanglikar.chapter2.SortingUtilities;

/**
 * <pre>
 * Chapter 2, Exercise 1, Problem 12
 * 
 * Instrument shell sort to print the number of compares divided by the arraysize for each increment.
 * Write a test client that tests the hypothesis that this number is a small constant,
 * by sorting arrays of random Double values, using array sizes that are increasing powers of 10, 
 * starting at 100.
 * 
 * @author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise1Problem12 implements Sort {

	private int comparisons = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds.pratiksanglikar.chapter2.Sort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] array) {
		int arraySize = array.length;
		int h = 0;
		while (h <= arraySize / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < arraySize; i++) {
				for (int j = i; j >= h && SortingUtilities.isLesser(array[j], array[j - h]); j -= h) {
					comparisons++;
					SortingUtilities.exchange(array, j, j - h);
				}
			}
			h /= 3;
		}
	}

	/**
	 * returns the ratio of number of comparisons to array size.
	 * 
	 * @param array to be sorted
	 * @return ratio of number of comparisons to array size.
	 */
	@SuppressWarnings("rawtypes")
	public double getComparisonsToArraySizeRatio(Comparable[] array) {
		int arraySize = array.length;
		sort(array);
		System.out.println("ArraySize: " + arraySize);
		System.out.println("Comparisons: " + comparisons);
		return comparisons / arraySize;
	}
}
