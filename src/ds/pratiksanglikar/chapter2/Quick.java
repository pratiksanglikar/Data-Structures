/**
 * 
 */
package ds.pratiksanglikar.chapter2;

import static ds.pratiksanglikar.chapter2.SortingUtilities.*;
/**
 * Recursive implementation of Quick Sort.
 * 
 * @author Pratik Sanglikar
 *
 */
public class Quick implements Sort{

	/* (non-Javadoc)
	 * @see ds.pratiksanglikar.chapter2.Sort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] array) {
		sort(array, 0, array.length - 1);
	}
	
	/**
	 * Recursive quick sort method.
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	@SuppressWarnings("rawtypes")
	private void sort(Comparable[] array, int low, int high) {
		if(high <= low) {
			return;
		}
		int j = partition(array, low, high);
		sort(array, low, j-1);
		sort(array, j+1, high);
	}

	/**
	 * Returns the partition index.
	 * 
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private int partition(Comparable[] array, int low, int high) {
		int i = low;
		int j = high + 1;
		Comparable v = array[low];
		while(true) {
			while(isLesser(array[++i], v)) {
				if(i == high) 
					break;
			}
			while(isLesser(v, array[--j])) {
				if(j == low) 
					break;
			}
			if( i >= j) {
				break;
			}
			exchange(array, i, j);
		}
		exchange(array, low, j);
		return j;
	}

}
