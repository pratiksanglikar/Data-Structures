/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem15;

/**
 * Contains the function to calculate histogram with provided input array and a random int m.
 * 
 * @author Pratik Sanglikar
 */
public class Histogram {
	
	/**
	 * static method histogram() that takes an array inputArray[] of integer values 
	 * and an integer m as arguments and returns an array of length m whose ith entry 
	 * is the number of times the integer i appeared in the argument array.
	 *  
	 * @param inputArray
	 * @param m
	 * @return histogram. An array of length m whose ith entry is the number of times i
	 * appeared in inputArray.
	 */
	public static int[] histogram(int[] inputArray, int m) {
		int histogram[] = new int[m];
		initializeHistogram(histogram);
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] < m) {
				histogram[inputArray[i]]++;
			}
		}
		return histogram;
	}

	/**
	 * initializes the histogram array with all zero's.
	 * @param histogram
	 */
	private static void initializeHistogram(int[] histogram) {
		for(int i = 0; i < histogram.length; i++) {
			histogram[i] = 0;
		}
	}
}
