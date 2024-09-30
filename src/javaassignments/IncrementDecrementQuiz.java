package javaassignments;

public class IncrementDecrementQuiz {

	public static void main(String[] args) {
		//boolean b = true;
		//b++;
		//System.out.println(b);
		
	//Cast boolean to byte : here we used ternary operator( ? :)
		boolean boolvalue = false;
		byte bytevalue = (byte)(boolvalue?1:0);
		bytevalue++;
		System.out.println("boolean cast to byte: "+ bytevalue );

	//casting boolean to int
		int intvalue = (int)(boolvalue?1:0);
		System.out.println("boolean cast to int : "+intvalue);
		
   // casting int to boolean : here we used conditional expression int/byte value is "0" means "false" and "any number" means "true"
		int i = 0;
		boolean b = (i!=0);
		System.out.println("casting int to boolean with conditional expression : " + b);
		
  // byte to boolean
		byte bytevalue1 = 9;
		boolean boolvalue1 = (bytevalue1!=0) ;
		System.out.println("Casting byte to boolean : "+ boolvalue1);
		
		long longvalue = 10000000L;
		boolean boolvalue2 = (longvalue!=0);
		System.out.println("cast long to boolean : "+ boolvalue2);
		
		char charvalue = 0;
		boolean boolChar = (charvalue!=0);
		System.out.println("cast char to boolean "+ boolChar);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
