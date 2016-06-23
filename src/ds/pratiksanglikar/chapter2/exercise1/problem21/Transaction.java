/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem21;

/**
 * Transaction class that maintains the monetory transactions.
 * 
 * @author Pratik Sanglikar
 *
 */
public class Transaction implements Comparable<Transaction> {
	
	private final int day;
	private final int month;
	private final int year;
	private double amount;
	
	public Transaction(int day, int month, int year, double amount) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.amount = amount;
	}
	
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	@Override
	public int compareTo(Transaction o) {
		if(this.year > o.year) return +1;
		if(this.year < o.year) return -1;
		if(this.month > o.month) return +1;
		if(this.month < o.month) return -1;
		if(this.day > o.day) return +1;
		if(this.day < o.day) return -1;
		if(this.amount > o.amount) return +1;
		if(this.amount < o.amount) return -1;
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("\nTransaction %02d/%02d/%4d \t amount: $%.3f", day, month, year, amount);
	}
}
