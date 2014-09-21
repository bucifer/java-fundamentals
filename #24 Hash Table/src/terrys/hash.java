package terrys;

import java.util.*;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map dict = new Hashtable();
		dict.put("fruit", "apple");
		dict.put("weapon", "lance");
		dict.put("animal", "lion");
		
		System.out.println("items in dictionary " + dict);
		System.out.println(dict.get("fruit"));
		
		dict.remove("animal");
		System.out.println("After deletion: " + dict);
		
		TBDictionary myDict = new TBDictionary();
		myDict.add("Kara", "Goo Hara");
		myDict.add("SNSD", "Sunny");
		myDict.add("4minute", "Hyuna");
		myDict.getAll();

		System.out.println("Getting value with key \"Kara\" from myDict: " + myDict.get("Kara"));
		System.out.println("Getting value with key \"Sunny\" from myDict: " + myDict.get("Sunny"));
		
		myDict.remove("4minute");
		myDict.getAll();
	}

}
