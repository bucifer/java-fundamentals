public class array_creator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countries = "USA, Canada, Mexico, Bermuda, Grenada, Belize, Korea";
		String delim = ", ";
		array_creator(countries, delim);
		
	}

	
	static void array_creator(String string, String delim) {
		
		//delimit the string by the comma
		//make an array
		
		String[] countries = string.split(delim);
		
		for (int i=0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}
	}
	
}
