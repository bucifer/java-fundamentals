package terrypackage;

public class pi {

	public static void main(String[] args) {		
		int n = 100;
		double insideLoopValue = 0;
		
		for (int i = 1; i <= n; i ++) {
			insideLoopValue = insideLoopValue + 1.0/(PowerCalculator.power_calculator(i,2));
		}
		
		double S = 6 * insideLoopValue;
		S = S * S;
		
		System.out.println(S);
		
	}

}
