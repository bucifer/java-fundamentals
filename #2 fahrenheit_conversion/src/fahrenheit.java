
import java.text.DecimalFormat;


public class fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahr, celsius;
		final int LOWER, UPPER, STEP;
		
		LOWER = -40;
		UPPER = 100;
		STEP = 1;
		
		System.out.println("Fahrenheit" + "\t" + "Celsius");
		for (fahr = LOWER; fahr <= UPPER; fahr += STEP) {
			celsius = 5 * (fahr - 32)/9;
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println(fahr + "\t        " + df.format(celsius));
		}
		
		
	}

}
