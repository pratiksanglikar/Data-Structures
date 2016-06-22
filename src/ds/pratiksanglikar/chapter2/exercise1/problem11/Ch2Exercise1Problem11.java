/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem11;

import java.util.ArrayList;
import java.util.List;

import ds.pratiksanglikar.chapter2.Sort;
import ds.pratiksanglikar.chapter2.SortingUtilities;

/**
 * <pre>
 * Chapter 2, Exercise 1, Problem 11
 * 
 * Implement a version of shell sort that keeps the increment 
 * sequence in an array, rather than computing it.
 *
 * @author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise1Problem11 implements Sort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds.pratiksanglikar.chapter2.Sort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] array) {
		int arraySize = array.length;
		Integer[] hArray = getHArray(arraySize);
		for (int k = 0; k < hArray.length; k++) {
			int h = hArray[k];
			for (int i = h; i < arraySize; i++) {
				for (int j = i; j >= h && SortingUtilities.isLesser(array[j], array[j - h]); j -= h) {
					SortingUtilities.exchange(array, j, j - h);
				}
			}
		}
	}

	/**
	 * Returns the hArray is that is required by the shell sort.
	 * 
	 * @param arraySize
	 * @return hArray.
	 */
	private Integer[] getHArray(int arraySize) {
		Integer h = 0;
		List<Integer> hArray = new ArrayList<Integer>(0);
		while (h < arraySize / 3) {
			h = h * 3 + 1;
		}
		while(h > 0) {
			hArray.add(h);
			h /= 3;
		}
		return (Integer[]) hArray.toArray(new Integer[hArray.size()]);
	}
}
