package terrypackage;

public class PowerCalculator {

	static long power_calculator(long base, long power) {
		
		long result = 1;
		
		for (int i = 1; i <= power; i++) {
			result = result * base;
		}
		
		return result;
		
	}
		
}
