package javasessions;

public class Assignments {

	public static void main(String[] args) {
	//1.Datatype Assignment - Expected outcome: Hello Naveen K
		
		String a = "Hello";
		String b = "Naveen K";
		System.out.println(a+" "+b);
		
	//2.Write a Java program to print the sum of two numbers.74 + 36 :110
		byte i = 74;
		byte j = 36;
		System.out.println(i+j);

		//3. Write a Java program to print the division of two numbers.50/3 = 16
		byte d1= 50;
		byte d2= 3;
		byte division = (byte)(d1/d2); 
		System.out.println(division);
		
	     //4. Simplified the expression ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) : 2.138888888888889
		    double num = ((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5));
		   System.out.println(num);
		   
		//5.Try to concat "Hello Selenium" with a character 't'.
		   String s = "Hello Selenium";
		   char ch ='t';
		   System.out.println(s+ch);
		 
		   //6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//"Your Total  amount is: 3700".
		   int x = 100;
		   int y= 200;
		   int z = 3400;
		  // int add = x+y+z;
		   System.out.println("Your Total amount is : "+ (x+y+z));
		   
		   //7.Print the ASCII value of the character 'h'.
		   char h = 'h';
		   int v = (char)(h);
		   System.out.println(v);
		   //or 
		   char ch1 = 'h';
		   System.out.println((byte)(ch1));
		   
		   
		   //8.Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		   
		   char ch2 = 'd';
		   System.out.println((char)((byte)(ch2 + 3)));
		   
		   
		   //9.Write a program to find the square of the number 3.9.
		   
		   float f = 3.9f;
		   System.out.println(f*f);
		   //or
		   System.out.println(Math.pow(f,2));
		   
		   
		   
		   
		   
		   
	}
   
}
