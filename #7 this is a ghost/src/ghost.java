public class ghost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toTest = "this is a test";
		te_replacer(toTest);
	}
	
	static void te_replacer(String string) {
		String left = "";
		String gho = "gho";
		String right = "";
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 't' && string.charAt(i+1) == 'e') {
				for (int j = i + 2; j < string.length(); j++) {
					right = right + string.charAt(j);
				}
				left = string.substring(0, i);
				System.out.println(left + gho + right);
				return;
			}
			else { 
				left = left + string.charAt(i);
			}	
		}
		
		System.out.println(left);
		
	}
		
}