/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem26;

import ds.pratiksanglikar.chapter2.Insertion;
import ds.pratiksanglikar.chapter2.Sort;
import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;
import ds.pratiksanglikar.lib.Stopwatch;

/**
 * Test client for Chapter 2, Exercise 1, Problem 26
 * 
 * @author Pratik Sanglikar
 *
 */
public class Ch2Exercise1Problem26Test {
	
	private static int[] primitiveArray;
	private static Integer[] intObjectArray;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double timeToSortPrmitives = sortPrimitives();
		double timeToSortObjects = sortObjects();
		StdOut.print("\n Time for sorting " + primitiveArray.length + " primitive integers is " + timeToSortPrmitives);
		StdOut.print("\n Time for sorting " + primitiveArray.length + " integer objects is " + timeToSortObjects);
	}

	/**
	 * @return
	 */
	private static double sortPrimitives() {
		generatePrimitiveIntArray();
		Stopwatch timer = new Stopwatch();
		Ch2Exercise1Problem26 sort = new Ch2Exercise1Problem26();
		sort.sort(primitiveArray);
		return timer.elapsedTime();
	}

	/**
	 * @return
	 */
	private static void generatePrimitiveIntArray() {
		int size = StdRandom.uniform(200000000);
		primitiveArray = new int[size];
		for (int i = 0; i < primitiveArray.length; i++) {
			primitiveArray[i] = (int) StdRandom.uniform() * 10000;
		}
	}

	/**
	 * @return
	 */
	private static double sortObjects() {
		generateIntObjectArray();
		Sort sortingStrategy = new Insertion();
		Stopwatch timer = new Stopwatch();
		sortingStrategy.sort(intObjectArray);
		return timer.elapsedTime();
	}

	/**
	 * @return
	 */
	private static void generateIntObjectArray() {
		intObjectArray = new Integer[primitiveArray.length];
		for (int i = 0; i < intObjectArray.length; i++) {
			intObjectArray[i] = primitiveArray[i];
		}
	}
}
