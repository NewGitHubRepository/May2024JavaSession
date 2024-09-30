package javaassignments;

public class LoopsAssignment {

	public static void main(String[] args) {
		
//1 and 2:
		int i = 1;
		while (i<=9) {
			System.out.println("I am Batman "+ i);
			i++;
		}

//3. WAP to print 10 to 1 using for, while and do-while loop		
		//for loop
		for (int j=10; j>=1; j--) {
			System.out.println(j);
		}
		
		//while loop
		int k=10;
		while (k>=1) {
			System.out.println(k);
			k--;
		}
		System.out.println("-----------------------------------");
		
		//do while loop
		int l=10;
		do {
			System.out.println(l);
			l--;
		}
		while(l>=1);

		System.out.println("-----------------------------------");
		//4.Write a program in Java to print "Hello World" ten times using while loop
		
		int m=1;
		while(m<=10) {
			System.out.println("Hello World");
			m++;
		}
		System.out.println("-----------------------------------");
		//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		
         for (int n=1;n<=100;n++) {
        	 if(n%5==0) {
        		 System.out.println(n);
        	 }
         }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
