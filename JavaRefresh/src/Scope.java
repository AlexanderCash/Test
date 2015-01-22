
public class Scope {
	/* Variable with private access specifier */
	private int nPrivate;
	
	/* Variable with public access specifier */
	public int nPublic;
	
	/** Constructor method */
	public Scope() {
		/* Assign values to the variables */
		nPrivate = 100;
		nPublic = 200;
		
		for(int i = 0; i < 10; i++) {
			/* 
			 * Create a temporary variable. The scope of
			 * this variable is the block it is created in.
			 * In this case, the loop. 
			 */
			int tempVar = i*5;
			
			nPublic += tempVar;
			
			/* 
			 * tempVar goes out of scope as soon as 
			 * this block ends, and hence does not
			 * persist between loop iterations.
			 */
		}
		
		/* tempVar does not exist here */
		
		System.out.println("nPrivate = " + nPrivate);
		System.out.println("nPublic = " + nPublic);
	}
	
	/** A set method for the private variable */
	public void SetValue(int new_nPrivate) {
		nPrivate = new_nPrivate;
	}
	
	/** A get method for the private variable */
	public int GetValue() {
		return nPrivate;
	}
	
	public static void main(String args[]) {
		new Scope();
	}
	
}
