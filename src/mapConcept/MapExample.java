package mapConcept;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		//Iterating Hashmap...
	//	1 Mango
	//  2 Apple
	//	3 Banana
	//	4 Grapes
		
		
		HashMap <Integer , String> fruits= new HashMap <Integer , String>();
		fruits.put(1, "Mango");
		fruits.put(2, "Apple");
		fruits.put(3, "Banana");
		fruits.put(4, "Grapes");
		
		System.out.println("Iterating Hashmap..........");
	    for(Map.Entry m : fruits.entrySet()) {
	    	System.out.println(m.getKey() + " "+ m.getValue());
	    }
		
		
		
	}

}
