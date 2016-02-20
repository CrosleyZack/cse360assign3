package cse360assign3;

public class Calculator {

	private int total;
	
	/**
	 * Constructor for calculator class. Initializes total to 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	 /**
	  * Returns the value stored in total.
	  * 
	  * @return total - returns the value stored in int total, or the value after the user has run any number
	  * 	of operations
	  */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds parameter value to total and stores the sum in total
	 * 
	 * @param value - value to add into total
	 */
	public void add (int value) {
		total += value; 
	}
	
	/**
	 * Subtracts value from total and stores difference in total
	 * 
	 * @param value - value to subtract from total
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * Multiplies value to total and stores product in total
	 * 
	 * @param value - value to multiply the total by
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * Divides total by value and stores quotient in total
	 * 
	 * @param value - value to divide the total by
	 */
	public void divide (int value) {
		if (value == 0)
			return;
		total /= value;
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}