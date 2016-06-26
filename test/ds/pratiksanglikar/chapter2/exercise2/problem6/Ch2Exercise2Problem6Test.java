/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise2.problem6;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * @author Pratik Sanglikar
 *
 */
public class Ch2Exercise2Problem6Test {

	@SuppressWarnings("rawtypes")
	private Comparable[] array = null;
	private Ch2Exercise2Problem6B bottomUpSort = new Ch2Exercise2Problem6B();
	private Ch2Exercise2Problem6A topBottomSort = new Ch2Exercise2Problem6A();
	private int arrayAccessesExptected = 0;

	@Before
	public void initialize() {
		initializeArray();
		calculateExpectedArrayAccesses();
	}

	/**
	 * calculates the expected array accesses using the formula - 6NLogN
	 */
	private void calculateExpectedArrayAccesses() {
		int arrayLength = array.length;
		arrayAccessesExptected = (int) (6 * arrayLength * (Math.log(arrayLength) / Math.log(2)));
	}

	/**
	 * initializes the array with random values.
	 */
	private void initializeArray() {
		int size = StdRandom.uniform(1000);
		array = new Double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = StdRandom.uniform(0.00, 10000.00);
		}
	}

	@Test
	public void testForBottomUp() {
		int arrayAccessesBottomUp = bottomUpSort.sortAndCountArrayAccesses(array);
		System.out.println("Bottom-Up: \t\tExpected: " + arrayAccessesExptected + " Got: " + arrayAccessesBottomUp);
		assertTrue(arrayAccessesBottomUp < arrayAccessesExptected);
	}

	@Test
	public void testForTopBottom() {
		int arrayAccessesTopBottom = topBottomSort.sortAndCountArrayAccesses(array);
		System.out.println("Top-Bottom: \t\tExpected: " + arrayAccessesExptected + " Got: " + arrayAccessesTopBottom);
		assertTrue(arrayAccessesTopBottom < arrayAccessesExptected);
	}
}