package terrys;

import java.util.*;

public class TBDictionary {

	//Instance variables
	ArrayList <String> keys = new ArrayList<String>();
	ArrayList <String> values = new ArrayList<String>();
	
	//Instance Methods
	void add(String key, String value) {
		keys.add(key);
		values.add(value);
		
		System.out.println("Added key-value pair: " + key + "=>" + value);
	}
	
	String get(String key) {
		if (keys.contains(key)) {
			int index = keys.indexOf(key);
			return values.get(index);
		} else {
			System.out.println("Key not found");
			return null;
		}	
	}
	
	void remove(String key) {
		if (keys.contains(key)) {
			System.out.println("Removing key-value pair: " + key + " => " + this.get(key));
			values.remove(keys.indexOf(key));
			keys.remove(key);
		} else {
			System.out.println("key not found");
		}
	}
	
	void getAll() {	
		System.out.println("GETALL INITIATED");

		for (int i = 0; i < keys.size(); i++) {
			System.out.println(keys.get(i) + " => " + values.get(i));
		}
	}
	
}

