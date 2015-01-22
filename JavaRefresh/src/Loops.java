/**
 * Class to demonstrate different loops in Java
 *
 */
public class Loops {
	/* Declare an array to work with */
	int[] array = { 1, 2, 4, 8, 16, 32, 64, 128 };
	
	/** Constructor Method */
	public Loops() {
		/* FOR LOOP */
		for(int i = 0; i < array.length; i++) {
			System.out.println("For " + i + " : " + array[i]);
		}
		
		/* WHILE LOOP */
		int j = array.length - 1;
		
		while(j >= 0) {
			System.out.println("While " + j + " : " + array[j]);
			j--;
		}
		
		/* DO WHILE */
		int k = -1;
		
		do {
			System.out.println("Inside the do-while loop");
		} while (k > 0);
	}
	
	
	public static void main(String args[]) {
		new Loops();
	}
}
