package cse360assignment02;

/**
 * Assignment 1(canvas)? 2(instructions)?
 *
 * @author Matthew Mooneyham
 * @version 1
 */
public class AddingMachine {
    private int total;
    private String history = "";
    
    public AddingMachine () {
        total = 0;
        history = "0"; 
    }  
  
    /**
     * Returns the current total
     */
    public int getTotal () {
        return total;
    } 
    
    /**
     * Adds the given value to the current total
     */
    public void add (int value) {
        total += value;
        history += (" + " + value);
    } 
    
    /**
     * Subtracts the given value to the current total
     */
    public void subtract (int value) {
        total -= value;
        history += (" - " + value);
    } 

    /**
     * returns the history of the adder
     */
    public String toString () {
        return history;
    } 

    /**
     * Clears the "memory" by resetting the total to 0 and erasing the history
     */
    public void clear() {
        total = 0;
        history = "0";
    } 
}
