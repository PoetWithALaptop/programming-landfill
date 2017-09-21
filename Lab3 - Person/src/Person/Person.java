package Person;

/* Name: Thomas Jackson
 * Lab Section: CS-2000-L1
 * Lecture Section: CS-2003-01
 * Date: September 14, 2017
 * Assignment: Lab 3 - Person
 */

public class Person 
{
	static int current_year = 2017;
	private String name;	
	private int birthday;
	private int age;
	
	//constructor
	public Person(String name, int birthday)
	{
		this.name = name;
		this.birthday = birthday;
	}

	
	public void reset_birthday(int year){
		birthday = year;
	}
	
	public void display_information(){
		System.out.printf("This is " + name );
		System.out.printf("I was born in %d. ",birthday);
		age = current_year - birthday;
		System.out.printf("I am %d years old ",age);
	}
	
	public void age_if()
	{
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.display_information();
		
		
	}

}
