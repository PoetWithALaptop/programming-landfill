package Lab1b;
/* Name: Thomas Jackson
 * Lab Section: CS-2000-L1
 * Lecture Section: CS-2003-01
 * Date: August 31, 2017
 * Assignment: Lab 1b
 */


/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author
 */
 
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.IOException;

public class Lab1b 
{
    
    // data members

    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param filename name of the file containing doubles.
    */
    public Lab1b(String filename) 
    {
	readFile(filename);
    }

    /** Reads double from a file named <code>filename</code> and
     * computes the average of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     */
    public void readFile(String filename) 
    {
    	try {
    	    File inputFile = new File("Lab1a.dat");
    	    Scanner input = new Scanner(inputFile);
    	    Vector<Integer> intVector = new Vector<Integer>();
    	    int max; int elt,count=0;
    	    // store all elements in a vector
    	    if ((elt = input.nextInt() = true))
    	    	{
    	    	count++;
    	    	intVector.addElement(elt);
    	    	}
    	    else
    	    	(elt = null);
    	    // print on the terminal each elements of intVector
    	    System.out.printf("There are %d integers in the input file:\n",
    			       count);
    	    for (int value: intVector)
    		System.out.printf("%d ",value);
    	    System.out.println();
    	    
    	    // Find the max   
    	    for(int i=1;i<intVector.size();i++){
    	    	int value=intVector.get(i);
    	    	if(max > value)
    	    		max = value;
    	    }

    	    //output results
    	    System.out.printf("The maximum integer in the input file is %d\n",max);
    	    input.close();
    	} 
    	catch (IOException e) 
    	{
    	    System.err.println("IOException in reading input file!!!");
    	}	
        
    } //end readFile()
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument*/
    public static void main(String args[]) {
	if (args.length == 0)
	    System.err.println("enter the data file name!");
	else
	    new Lab1b(args[0]);
    } //end main
    
} //end class Lab1b
