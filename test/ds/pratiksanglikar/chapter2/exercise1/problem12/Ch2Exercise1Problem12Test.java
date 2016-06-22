/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem12;

import static org.junit.Assert.*;

import org.junit.Test;

import ds.pratiksanglikar.lib.StdRandom;

/**
 * @author Pratik Sanglikar
 *
 */
public class Ch2Exercise1Problem12Test {

	@Test
	public void test() {
		Ch2Exercise1Problem12 sort = new Ch2Exercise1Problem12();
		Double[] array;
		double arraySizeToComparisonsRatio;
		for (int i = 1; i < 10000; i *= 10) {
			array = getRandomArray(i * 100);
			arraySizeToComparisonsRatio = sort.getComparisonsToArraySizeRatio(array);
			System.out.println(arraySizeToComparisonsRatio);
			assertTrue(arraySizeToComparisonsRatio < 100);
		}
	}

	private Double[] getRandomArray(int size) {
		Double[] array = new Double[size];
		System.out.println("Size: " + size);
		for (int i = 0; i < size; i++) {
			array[i] = StdRandom.uniform();
		}
		return array;
	}
}
