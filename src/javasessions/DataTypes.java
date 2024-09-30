package javasessions;

public class DataTypes {
        byte age = 18;
        
        public byte display() {
        	return age;
        }
	
	
	public static void main(String[] args) {
		
		//data types: 
		//1. Primitive data type : reserved data type 
		 // Numeric data type : // byte , short , int ,long
		 //floating type : float , double 
		 //character data type : char
		 //boolean data type : boolean
		//2. Non Primitive data type : class , array , interface, object
		
		//1. byte : 
		//size :1 byte = 8 bits
		// range = (-2^7 to (2^7 -1)) : -128 to 127
		byte b = 20 ;
		System.out.println(b);
		byte b1 = -128;
		b1=127;
		System.out.println(b1);
		
		//Using byte with method
		DataTypes DT = new DataTypes();
		System.out.println("The age must be : " + DT.display());
		
		// short : 
		//Size: 2 bytes = 2*8 = 16 bits
		//range: -2^15 to 2^15-1 : -32768 to 32767
		
		short s = 20000;
		short s1 = -32000;
		System.out.println(s+ " and "+ s1);
		
		short s2 =(short)-32770; // type casting 
		System.out.println(s2);
		
	// check whether the short data type holds char value.
   //In such case, the compiler typecast the character implicitly to short type and returns the corresponding ASCII value.
		short sh = 'a';
		System.out.println("short value : " + sh);
		
		char ch ='a';
		System.out.println("char value : " + ch);
		
		byte bh = '0';
		System.out.println("byte value : " + bh);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
