package constructorAssignment;

public class Car {
	/*
	 * Create a Java class named "Car" with the following instance variables: make
	 * (String) model (String) year (int) Create a constructor for the Car class
	 * that takes in the make, model, and year as parameters and initializes the
	 * instance variables. Create a default constructor for the Car class that sets
	 * the make, model, and year to "Unknown". Create a main method that creates
	 * three instances of the Car class using both constructors and prints out their
	 * information.
	 */
	
	
	String make;
	String model;
	int year;
//Constructor
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public Car() {
		make = "Unknown";
		model = "Unknown";
		year = 0;
	}
	//getter method 
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


	public static void main(String[] args) {
	  Car car1 = new Car();
	  System.out.println("Car1 info using constructor:"+ car1.getMake() + ", "+ car1.getModel()+", "+ car1.getYear());
	  
	  Car car2 = new Car("audiMake","ID12345", 2002);
	  System.out.println("Car2 info using constructor:"+ car2.getMake() + ", "+ car2.getModel()+", "+ car2.getYear());
	  
	  Car car3 = new Car("Honda","MD99999", 2019);
	  System.out.println("Car3 info using constructor:"+ car3.getMake() + ", "+ car3.getModel()+", "+ car3.getYear());
	}

}
