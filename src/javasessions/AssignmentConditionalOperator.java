package javasessions;

public class AssignmentConditionalOperator {

	public static void main(String[] args) {
		// Find out the greatest number out of three different given numbers:

	    int a= 23;
	    int b = 87;
	    int c = 98;
	    if(a>b) {
	    	System.out.println("The greatest :"+ a);
	    }
	    else if (b>c){
	    	System.out.println("The greatest :"+ b);
	    	
	    }else {
	    	System.out.println("The greatest :"+  c);
	    }
	    
	   

	//1.b : Find out the greatest number out of four different given numbers:

	int a1= 25; 
	int a2= 78;
	int a3= 87;
	int a4 = 97;
	 if(a1>a2) {
	    	System.out.println("The greatest :"+ a1);
	    }
	    else if (a2>a3){
	    	System.out.println("The greatest :"+ a2);
	    	
	    }else if(a3>a4){
	    	System.out.println("The greatest :"+  a3);
	    }
	    else {
	    	System.out.println("The greatest :"+  a4);
	    }
	    
	 
	// 2. Write a Java program to test a number is positive or negative.

	// Test Data : Input number: 35 -- positive number,  Input number: -11 -- negative number
	 
     int num1= 35;
	 int num2 = -11;
	 
	 if(num1>0) {
		 System.out.println("positive number: "+ num1);
	 }
	 if(num2<0) {
		 System.out.println("negative number: "+ num2);
	 }
	 
	 int num = -50;
	 if(num>0) {
		 System.out.println("It's a positive number: " + num);
	 }else {
		 System.out.println("It's a negative number: "+ num);
	 }
	 
	
	 
	}
		
	
	
	}


