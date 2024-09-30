package constructorAssignment;

public class Person {
	/*
	 * Assignment 1: Create a Java class named "Person" with the following instance
	 * variables: name (String),age (int),gender (char)height (double) Create a
	 * constructor for the Person class that takes in the name, age, gender, and
	 * height as parameters and initializes the instance variables. Create a main
	 * method that creates two instances of the Person class using the constructor
	 * and prints out their information.
	 * 
	 */	
	String name;
	int age;
	char gender;
	double height;
	
	public Person(String name, int age, char gender,double height) {
		this.name= name;
		this.age= age;
		this.gender= gender;
		this.height= height;
		
	}

	public static void main(String[] args) {
		Person p = new Person("Naveen",30,'M',300);
		
		Person p2= new Person("Yogi",6,'M',150);
		
		System.out.println("Person's Information :"+ p.name+" , "+p.age+" , "+p.gender+" , "+p.height);
		System.out.println("Person's Information :"+ p2.name+" , "+p2.age+" , "+p2.gender+" , "+p2.height);
		
			}

}
