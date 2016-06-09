/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise1.problem14;

/**
 * @author Pratik Sanglikar
 *
 */
public class Logarithms {

	/**
	 * returns the largest integer not larger than the base-2 logarithm of n.
	 * @param n
	 * @return
	 */
	public static int lg(int n) {
		int logarithm = 0;
		boolean isPowerOf2 = true;
		if(n < 0) {
			return logarithm;
		}
		while(n > 1) {
			if(n % 2 > 0) {
				isPowerOf2 = false;
			}
			n /= 2;
			logarithm++;
		}
		if(isPowerOf2) {
			logarithm--;
		}
		return logarithm;
	}
}
