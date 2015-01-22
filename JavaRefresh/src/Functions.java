/**
 * Class to demonstrate Java methods / functions
 *
 */
public class Functions {
	/* Declare some dummy variables */
	int a = 5;
	int b = 24;
	int c = 32;
	
	/** Constructor method */
	public Functions() {
		int d = Sum(a, b); // Function calls
		int e = Sum(b, c);
		int f = Sum(d, e);
		
		System.out.println("D: " + d + "\nE: " + e + "\nF: " + f);
	}
	
	/** Method to return an integer sum. Two integer arguments */
	public int Sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String args[]) {
		new Functions();
	}
}
