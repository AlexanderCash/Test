/**
 * Class to demonstrate arrays in Java
 * 
 */
public class Arrays {
	/* Declare arrays */
	int[] intArray;
	float[] floatArray;
	
	/* A way to declare an array with preset values. */
	int[] intArray2 = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
	
	/** Constructor Method */
	public Arrays() {
		/* Array instantiation */
		intArray = new int[10];
		floatArray = new float[10];
		
		System.out.println("The value of intArray2 at index 4 is " + intArray2[4]);
		
		/* Array assignment */
		intArray2[4] = 9999;
		
		System.out.println("The value of intArray2 at index 4 is now " + intArray2[4]);
	}
	
	public static void main(String args[]) {
		new Arrays();
	}
}
