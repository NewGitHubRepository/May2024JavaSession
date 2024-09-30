package encapsulationAssignment;

public class Person {

	//Create a class called "Person" with the following private attributes: name (String), age (int), and gender (String).

	//Create getter and setter methods for each attribute.

	//Write a method called "printInfo" that prints out the name, age, and gender of the person.

	//Create an instance of the "Person" class and set its attributes using the setter methods.

	//Call the "printInfo" method to verify that the data was set correctly.
	
	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printInfo() {
		System.out.println("Name : "+ name+ " ,Age : "+ age+ " ,Gender : "+ gender);
	}
	


	public static void main(String[] args) {
	 Person p = new Person();
	 p.setName("Bhanu");
	 p.setAge(30);
	 p.setGender("Male");
     p.printInfo();
	}

}
