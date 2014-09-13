
public class ArrayOfStrings {

	
	public static void main(String[] args) {
		
		String[] stringArray = {"I am", " an", " apple"};
		
		array_joiner(stringArray);
		
	}
	
	
	static void array_joiner(String[] stringArray) {
		String result = "";
		
		for (int i=0; i < stringArray.length; i++) {
			result += stringArray[i];
		}
		
		System.out.println(result);
	}
	
	
}
