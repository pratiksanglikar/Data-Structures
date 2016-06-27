/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise2.problem10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.pratiksanglikar.chapter2.Sort;
import ds.pratiksanglikar.chapter2.SortingUtilities;
import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * @author Pratik Sanglikar
 *
 */
public class Ch2Exercise2Problem10Test {
	
	Double[] array;
	Sort sortingStrategy = new Ch2Exercise2Problem10();

	@Before
	public void intializeArray() {
		int size = StdRandom.uniform(1000);
		array = new Double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = StdRandom.uniform(0.00, 10000.00);
		}
	}
	
	@Test
	public void test() {
		StdOut.println("\n");
		SortingUtilities.show(array);
		sortingStrategy.sort(array);
		StdOut.print("\n After sorting: ");
		SortingUtilities.show(array);
		assertTrue("After applying selection sort, the array must be sorted.", SortingUtilities.isSorted(array));
	}
}
