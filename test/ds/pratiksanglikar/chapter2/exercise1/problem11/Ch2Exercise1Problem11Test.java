/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem11;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import ds.pratiksanglikar.chapter2.Sort;
import ds.pratiksanglikar.chapter2.SortingUtilities;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * @author Pratik Sanglikar
 *
 */
public class Ch2Exercise1Problem11Test {
	
	Double[] array;

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
		Sort modifiedShell = new Ch2Exercise1Problem11();
		modifiedShell.sort(array);
		assertTrue(SortingUtilities.isSorted(array));
	}
}