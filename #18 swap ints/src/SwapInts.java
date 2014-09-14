
public class SwapInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//the moral of the story is that it's not like C/C++ because java doesn't use pointers.
		//swapping two integers is easy in main but not very easy from doing it from another function
		
		int a = 8;
		int b = 14;
		
		System.out.println(a + "\t" + b);
		
		a = b - a;
		b = b - a;
		a = a + b;
		
		
		System.out.println(a + "\t" + b);
		
	}

	
//	static void swap_ints (int a, int b) {
//		does not work	
//		a = b - a;
//		b = b - a;
//		a = a + b;
//		
//	}
	
	
}
