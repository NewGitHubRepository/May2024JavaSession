package constructorAssignment;

public class Rectangle {
	/*
	 * Assignment 2: Create a Java class named "Rectangle" with the following
	 * instance variables: length (double) width (double) Create a default
	 * constructor for the Rectangle class that sets both the length and width to
	 * 0.0. Create a constructor for the Rectangle class that takes in the length
	 * and width as parameters and initializes the instance variables. Create a
	 * method in the Rectangle class named "calculateArea" that returns the area of
	 * the rectangle (length * width). Create a main method that creates two
	 * instances of the Rectangle class using both constructors, calculates and
	 * prints out their respective areas.
	 */
	double length;
	double width;
	public Rectangle(){
		length=0.0;
		width=0.0;
	}
	public Rectangle(	double length,	double width){
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea(double length,	double width) {
		return (length * width);
	}
	
	
	public static void main(String[] args) {
		Rectangle rect= new Rectangle();
		double areaDC = rect.calculateArea(rect.length, rect.width);
		System.out.println("Area of Rectangle with default constructor : "+ areaDC);
		
		Rectangle rect2= new Rectangle(20.0, 20.0);
		double areaPC = rect2.calculateArea(rect2.length, rect2.width);
		System.out.println("Area of Rectangle with parameterized constructor : "+ areaPC);

	}

}
