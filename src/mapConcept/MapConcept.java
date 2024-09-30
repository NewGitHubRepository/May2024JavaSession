package mapConcept;

import java.util.HashMap;

public class MapConcept {

	public static void main(String[] args) {
	    
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		map.put("Chrome", 101);
		map.put("FireFox", 96);
		map.put("ie", 111);
		 
		System.out.println(map.get("Chrome"));
		
		//<Integer, Integer>
		HashMap<Integer, Integer> map1= new HashMap<Integer, Integer>();
		map1.put(1, 101);
		System.out.println(map1.get(101));// we need to pass only key ->value
		
		//<String, Object>
		
		HashMap<String, Object>data = new HashMap<String, Object>();
		data.put("name", "Veena");
		data.put("age", 25);
		data.put("designation", "SDET1");
		data.put("isperm", true);
		data.put("Gender", 'f');
		data.put(null, "pune");
		data.put("", 33.36);
			
		data.get("name");
		data.get("designation");
		Object updatedage = data.replace("age", 25, 35);
		
		System.out.println("age: "+ updatedage);
		System.out.println(data.get("age"));
		System.out.println(data);
		System.out.println(data.get(null));
		System.out.println(data.get(""));
		System.out.println(data.size());
		
		
		
		
		
	}

}
