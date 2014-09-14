public class nthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(	power_calculator(2, 3)	);
		//should return 8
		
		System.out.println(	power_calculator(2, 0)	);

		System.out.println(	power_calculator(2, 5)	);

		System.out.println(	power_calculator(2, 10)	);

		System.out.println(	power_calculator(2, 1)	);
		
		System.out.println(	power_calculator(200, 10)	);

	}
	
	static long power_calculator(long base, long power) {
		
		long result = 1;
		
		for (int i = 1; i <= power; i++) {
			result = result * base;
		}
		
		return result;
		
	}

}
