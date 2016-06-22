/**
 * 
 */
package ds.pratiksanglikar.chapter2;

/**
 * Implementation of Shell Sort.
 * 
 * @author Pratik Sanglikar
 */
public class Shell implements Sort {

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
		while (h < arraySize / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < arraySize; i++) {
				for (int j = i; j >= h && SortingUtilities.isLesser(array[j], array[j - h]); j -= h) {
					SortingUtilities.exchange(array, j, j - h);
				}
			}
			h /= 3;
		}
	}
}