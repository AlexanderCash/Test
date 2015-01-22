/**
 * Class to demonstrate conditional statements 
 * 
 */
public class Conditionals {
	/* Declare some dummy variables to use */
	boolean trueOrFalse = true;
	int a = 100;
	int b = 200;
	
	/** Constructor Method */
	public Conditionals() {
		/* IF STATEMENT */
		if(trueOrFalse) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		/* 
		 * The statement inside the brackets of an if statement is evaluated 
		 * to either false (zero) or true (non-zero). Hence operators such as
		 * < , > , <= , >= , == and != can be used.
		 */
		if(a > b) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("B is greater than A (Or they are equal)");
		}
		
		/* 
		 * If statements can evaluate combinations of conditions using
		 * the logical AND and logical OR operators; && and ||
		 */
		if(a > b && trueOrFalse) {
			System.out.println("Both conditions are true");
		} else {
			System.out.println("One or more conditions is false");
		}
		
		/* SWITCH CASE */
		int value = 3;
		
		switch(value) {
		case 1:
			System.out.println("Value is 1");
			break;
		case 2:
			System.out.println("Value is 2");
			break;
		case 3:
			System.out.println("Value is 3");
			break;
		default:
			System.out.println("Value fits none of the cases");
		}
	}
	
	public static void main(String args[]) {	
		new Conditionals();
	}
}
