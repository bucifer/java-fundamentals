
public class string_inequality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "say hello to my little friend";
		String b = "say mello to thy fiddle brand";
		String iAmEqualToA = "say hello to my little friend";
		
		string_check (a, b);
		string_check(a, iAmEqualToA); //expecting true
	}

	//static means it's a CLASS method, in this case, a class method for string_inequality class.
	//without it, you cannot call this in main because without static, the method becomes a "INSTANCE METHOD" where you have to INSTANTIATE SOME OBJECT to use it
	
	static void string_check (String a, String b) {
		if (a.equals(b)) System.out.println("true!");
		if (!a.equals(b)) System.out.println("FALSE NOT EQUAL DONEZO");
	}
	
}
