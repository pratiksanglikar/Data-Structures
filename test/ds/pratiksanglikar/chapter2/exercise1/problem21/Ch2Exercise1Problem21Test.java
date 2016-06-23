/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem21;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.pratiksanglikar.chapter2.Shell;
import ds.pratiksanglikar.chapter2.Sort;
import ds.pratiksanglikar.chapter2.SortingUtilities;
import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;
import ds.pratiksanglikar.lib.Stopwatch;

/**
 * A test case that tests the shell sort performance on Transactions. It
 * generates random number of random transactions and sorts them using shell
 * sort. It prints out time required to sort the the transactions.
 * 
 * @author Pratik Sanglikar
 */
public class Ch2Exercise1Problem21Test {

	private Transaction[] transactions;

	@Before
	public void initializeTrasactions() {
		int size = StdRandom.uniform(20000000);
		transactions = new Transaction[size];
		for (int i = 0; i < transactions.length; i++) {
			transactions[i] = getRandomTransaction();
		}
	}

	private Transaction getRandomTransaction() {
		Transaction transaction = null;
		int year = StdRandom.uniform(1970, 2016);
		int month = StdRandom.uniform(1, 12);
		int day = StdRandom.uniform(1, 28);
		double amount = StdRandom.uniform() * 100;
		transaction = new Transaction(day, month, year, amount);
		return transaction;
	}

	@Test
	public void test() {
		Stopwatch timer = new Stopwatch();
		SortingUtilities.show(transactions);
		StdOut.println("Sorting Started!");
		Sort shell = new Shell();
		shell.sort(transactions);
		SortingUtilities.show(transactions);
		StdOut.println(
				"\n\nTime required to sort " + transactions.length + " transactions: " + timer.elapsedTime() + "ms");
		assertTrue(SortingUtilities.isSorted(transactions));
	}
}
