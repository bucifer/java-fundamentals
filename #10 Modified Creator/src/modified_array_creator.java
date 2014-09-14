
public class modified_array_creator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countries = "USA.Canada,Mexico,Bermuda Grenada,Belize,Korea";
		array_creator(countries);
	}
	
	static void array_creator(String string) {
		
		//delimit the string by the comma
		//make an array
		
		String[] countries = string.split("[.,\\s+]");
		
		for (int i=0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}
	}
}
