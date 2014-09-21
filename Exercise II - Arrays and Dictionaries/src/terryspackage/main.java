package terryspackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[] companies = {"Apple", "Google", "Microsoft"};
			
			for (int i=0; i < companies.length; i++) {
				System.out.println(companies[i]);
			}
			/*Array to ArrayList conversion*/
			ArrayList<String> companies_list= new ArrayList<String>(Arrays.asList(companies));
			
			companies_list.add("Facebook");
			System.out.println(companies_list.get(3));
			System.out.println(companies_list.size());
			
			Map<String, String> companyDict = new HashMap<String, String>();
			companyDict.put("AAPL", "Apple");
			companyDict.put("GOOG", "Google");
			companyDict.put("MSFT", "Microsoft");
			
			//this is a for-loop for looping through sets 
			for (String key: companyDict.keySet()) {
				System.out.println(key + " - " + companyDict.get(key));
			}
			//this is a for-loop or looping through an entire dictionar's key-value pair
			//you will notice that once you have the key, getting value is super easy
			//but it's not that easy other way around for Java (getting key when you know value)
			for(Map.Entry entry: companyDict.entrySet()){
	            if(entry.getValue().equals("Microsoft")){
	            	System.out.println(entry.getKey());
	            }
	        }
			
			companyDict.put("FB", "Facebook");
			companyDict.remove("AAPL");
			
			//print # of elements in dict
			System.out.println(companyDict.size());

			Company company1 = new Company();
			company1.companyLogoName = "google.png";
			company1.stockPrice = 1000;
			company1.companyName = "Google";
			
			System.out.println(company1.companyLogoName + company1.companyName + company1.stockPrice);
			
			//this is how you add a whole bunch of things to an arrayList
			//remember to initialize ArrayList before adding stuff to it 
			String[] tempAllProducts = new String[] {"AdSense", "AdWords", "GoogleDocs"};
			company1.products.addAll(Arrays.asList(tempAllProducts));
			
			for (int i=0; i < company1.products.size();i++) {
				System.out.println(company1.products.get(i));
			}
			
			company1.products.remove("GoogleDocs");
			System.out.println("****** post removal ******");

			for (int i=0; i < company1.products.size();i++) {
				System.out.println(company1.products.get(i));
			}
			
			Product product1 = new Product();
			product1.productLogo = "maps.png";
			product1.productName = "GoogleMaps";
			product1.productURL = "maps.com";
			Product product2 = new Product();
			product2.productLogo = "plus.png";
			product2.productName = "Google+";
			product2.productURL = "plus.com";
			
			company1.products.add(product1);
			company1.products.add(product2);

			
			System.out.println("****** post adding two product objects ******");

			for (int i = 0; i < company1.products.size(); i++) {
				System.out.println(company1.products.get(i));
			}
	}

}
