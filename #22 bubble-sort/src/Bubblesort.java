import java.util.Arrays;


public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {5, 1, 12, -5, 16, 0, -322, 343};
		
		bubblesort (myArray);
	}	
	
	
	static void bubblesort(int[] anyArray) {
		
		boolean swappedBool = true;
		while (swappedBool == true) {
			swappedBool = false;
			for (int i=0; i < anyArray.length-1; i++) {
				if (anyArray[i] > anyArray[i+1]) {
					int temp = anyArray[i+1];
					anyArray[i+1] = anyArray[i];
					anyArray[i] = temp;
					swappedBool = true;
				}
			
			}
		}
		System.out.println(Arrays.toString(anyArray));
	}
	
}
