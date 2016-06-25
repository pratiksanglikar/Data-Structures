/**
 * 
 */
package ds.pratiksanglikar.chapter2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * @author Pratik Sanglikar
 *
 */
public class SortingTest {

	Double[] array;
	Sort sortingStrategy;

	@Before
	public void intializeArray() {
		int size = StdRandom.uniform(1000);
		array = new Double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = StdRandom.uniform(0.00, 10000.00);
		}
	}

	@Test
	public void selectionSortTest() {
		sortingStrategy = new Selection();
		test();
	}

	@Test
	public void insertionSortTest() {
		sortingStrategy = new Insertion();
		test();
	}

	@Test
	public void shellSortTest() {
		sortingStrategy = new Shell();
		test();
	}
	
	@Test
	public void mergeSortTest() {
		sortingStrategy = new Merge();
		test();
	}

	public void test() {
		StdOut.println("\n");
		SortingUtilities.show(array);
		assertFalse("The randomly generated array must not be sorted first.", SortingUtilities.isSorted(array));
		sortingStrategy.sort(array);
		StdOut.print("\n After sorting: ");
		SortingUtilities.show(array);
		assertTrue("After applying selection sort, the array must be sorted.", SortingUtilities.isSorted(array));
	}
}