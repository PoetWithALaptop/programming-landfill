/* Name: Thomas Jackson
 * Lab Section: CS-2000-L1
 * Lecture Section: CS-2003-01
 * Date: September 28, 2017
 * Assignment: Lab 5 - Recursion
 */

package Lab5;

public class Recursion 
{

	public static int counter(String str)
	{
		if (str.equals(""))
			return 0;
		if (str.charAt(0) == 'x')
			return (1 + counter(str.substring(1)));
		else 
			return counter(str.substring(1));
	}
	
	public static void main(String[] args) 
	{
		String str1 = "xxlolxx";
		String str2 = "xxhaloxoverxcodxx";
		String str3 = "lolhaloovercod";
		
		System.out.println("The number of x's for the following strings are: ");
		System.out.println(counter(str1));
		System.out.println(counter(str2));
		System.out.println(counter(str3));

	}
	
	public static boolean isaPalindrome(String str)
	{
		if (str.equals(""))
			return false;
		else 
			return true;
	}

}
