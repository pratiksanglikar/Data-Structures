/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem26;

/**
 * <pre>
 * Chapter 2, Exercise 1, Problem 26
 * 
 * Primitive types. 
 * Develop a version of insertion sort that sorts arrays of int values 
 * and compare its performance with the implementation given in the text 
 * (which sorts Integer values and implicitly uses autoboxing and auto-unboxing to convert).
 * 
 * @author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise1Problem26 {
	
	/**
	 * Implementation of insertion sort for primitive datatype integer.
	 * 
	 * @param array
	 */
	public void sort(int[] array) {
		int arraySize = array.length;
		for(int i=1;i<arraySize;i++) {
			for(int j=i;j>=0 && array[j] > array[j-1];j--) {
				exchange(array, j, j-1);
			}
		}
	}

	/**
	 * exchanges two elements of array specified by index i and j
	 * 
	 * @param array  
	 * @param j
	 * @param i
	 */
	private void exchange(int[] array, int j, int i) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
