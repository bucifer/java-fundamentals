package terryspackage;

public class findn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double S = 3.141592;
		double limit = S * S/6;
		double total = 0;
		long n = 1;

		while (total <= limit) {
			total = total + 1.0/(PowerCalculator.power_calculator(n, 2));
			n = n + 1;
		}
		
		
		System.out.println("value of n is " + n);
		
		
	}

}
