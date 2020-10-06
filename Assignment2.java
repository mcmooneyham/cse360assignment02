package cse360assignment02;


/**
 * This is a test class for the Adding machine
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assignment2
{
    // instance variables - replace the example below with your own
    private static AddingMachine adder = new AddingMachine();
    public static void main(String args[]) 
    {
        adder.add(5);
        adder.add(12);
        adder.subtract(2);
        System.out.println(adder);
        
        adder.clear();
        
        System.out.println(adder);
        
        adder.add(7);
        adder.subtract(8);
        adder.add(15);
        System.out.println(adder + " = " + adder.getTotal());
        
    }
}
