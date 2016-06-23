/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem16;

import org.junit.Before;
import org.junit.Test;

import ds.pratiksanglikar.lib.StdRandom;
import static org.junit.Assert.*;

/**
 * @author Pratik Sanglikar
 *
 */
public class Ch2Exercise1Problem16Test {

	private Double[] array;
	
	@Before
	public void initializeArray() {
		int size = StdRandom.uniform(100000);
		array = new Double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = StdRandom.uniform();
		}
	}
	
	@Test
	public void test() {
		boolean isInPlace = Ch2Exercise1Problem16.check(array);
		assertTrue(isInPlace);
	}

}
