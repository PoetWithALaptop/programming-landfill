package umple;
import java.util.Scanner;
public class Customer 
{
	
	public Customer (String fn, String ln, String add, String pn)
	{
		
		Scanner input = new Scanner( System.in );
		
		System.out.printf( "Please enter your first name: " );
		
		String fname = input.next();
		
		System.out.printf( "Please enter your last name: " );
		
		String lname = input.next();
		
		System.out.printf( "Please enter your address: " );
		
		String address = input.next();
		
		System.out.printf( "Please enter your phone number: " );
		
		String pnumber = input.next();
		
		fn = fname;
		ln = lname;
		add = address;
		pn = pnumber;
		
		input.close();
	}
}
