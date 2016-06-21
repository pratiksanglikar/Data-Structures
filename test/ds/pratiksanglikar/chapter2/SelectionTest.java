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
public class SelectionTest {

	Double[] array;

	@Before
	public void intializeArray() {
		int size = StdRandom.uniform(1000);
		array = new Double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = StdRandom.uniform(0.00, 10000.00);
		}
		SortingUtilities.show(array);
	}

	@Test
	public void test() {
		assertFalse("The randomly generated array must not be sorted first.", SortingUtilities.isSorted(array));
		Selection.sort(array);
		StdOut.print("\n");
		SortingUtilities.show(array);
		assertTrue("After applying selection sort, the array must be sorted.", SortingUtilities.isSorted(array));
	}
}