package cse360assignment02;

/**
 * This class executes a few simple methods
 * @author ericgarcia
 * @version 1.0
 */

public class AddingMachine {
	
	
	private int total;
	  
	String line = "0";
	
	  public void AddingMachine () {
	    total = 0; 		// not needed - included for clarity
	    
	  }
	  
	  /**
	   * This returns the interger total
	   * @return is the current total
	   */
	  
	  public int getTotal () {
		  
	    return total;
	  
	  }
	  
	  /**
	   * This adds the parameter to the value 
	   * @param value
	   */
	  
	  public void add (int value) {
		  
		  total += value;
		  line += " + " + value;
		  
	  }

	  /**
	   * This subtracts the parameter to the value
	   * @param value
	   */
	  
	  public void subtract (int value) {
		  
		  total -= value;
		  line += " - " + value;
		  
	  }

	  /**
	   * 
	   */
	  
	  public String toString () {
	    return line;
	  }
	  
	  /**
	   * This clears the memory
	   */

	  public void clear() {
		  
		  total = 0;
		  
	  }
}
