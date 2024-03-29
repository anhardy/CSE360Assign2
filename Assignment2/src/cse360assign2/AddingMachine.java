package cse360assign2;
/**
 * Adam Hardy
 * CSE360-85141
 * Assignment 2
 * 
 * This class adds or subtracts numbers from the total variable and saves a 
 * history of transactions
 */
public class AddingMachine {

	private int total;
	private String history = "0";
	
	/**
	 * Default constructor for class, initializing total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 *Get method for obtaining the value of private variable total
	 * @return the value of total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds to total
	 * @param value value to be added to total
	 */
	public void add (int value) {
	total += value;	
	history = history.concat(" + " + value);
	}
	
	/**
	 * Subtracts from total
	 * @param value value to be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		history = history.concat(" - " + value);
	}
	
	/**
	 * Used to save a history of transactions as a String
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Undefined in project instructions
	 */
	public void clear() {
	
	}
	
}
