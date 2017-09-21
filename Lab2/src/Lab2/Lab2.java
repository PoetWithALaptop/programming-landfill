package Lab2;
import java.util.Scanner;
import java.io.*;
/* Name: Thomas Jackson
 * Lab Section: CS-2000-L1
 * Lecture Section: CS-2003-01
 * Date: September 7, 2017
 * Assignment: Lab 2
 */

public class Lab2 
{
	public void setFile() throws IOException
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Number of Rows: ");
		final int rows = console.nextInt();
		System.out.println("Number of Columns: ");
		final int columns = console.nextInt();
		System.out.println("Choose a file name to input: ");
		String filename = console.next();
		FileWriter setSeat = new FileWriter(filename);
		PrintWriter outputfile = new PrintWriter(setSeat);
		outputfile.printf("%d/n", rows);
		outputfile.printf("%d/n", columns);
		outputfile.close();
		console.close();
		
	}
	

	
	public void readFile() extends setFile
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Enter file name: ");
		String input = console.next();
		int inrows = rows;
		int incolumns = columns;
		System.out.print(outputfile);
		console.close();
	}

}