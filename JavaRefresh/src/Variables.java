/**
 * This class demonstrates some common variable types available in java. Also type casting and operators
 * NOTE the comments are much too long and badly formatted. 
 *
 */
public class Variables {
	/* VARIABLE DECLARATIONS */
	
	/* Common Variables */
	int nInteger;					/* An integer number (signed) */
	float fFloat;					/* A floating point (decimal place) number */
	double dDouble;					/* The same as a float but twice as big memory wise (can hold much larger values / more decimal places) */
	boolean bBool;					/* A boolean digit, can either be 1 (on) or zero (off) */
	String sString;					/* Not actually a variable but never mind. Holds a string of characters. Important for text. */
	
	/* Less common variables */
	byte byByte;					/* A single byte number */
	short shShort;					/* A two byte number */
	long lLong;						/* An 8 byte number. Useful for very big integers */
	char cChar;						/* A single alphanumerical character. Frustrating to use, String is better. */

	/** Constructor Method */
	public Variables() {
		/* VARIABLE ASSIGNMENT */
		nInteger = 1;
		fFloat = 3.14f;
		dDouble = 3.14; 			// Note the absence of the 'f'
		bBool = true;
		
		/* String works slightly differently, more on that later. */
		String sString = new String("I am not like the other variables, because [reasons].");

		/* TYPE CASTING */
		nInteger = (int)fFloat;  	/* This is dangerous! Loss of precision. */
		dDouble = (double)fFloat; 	/* This is not so bad as a double can easily accommodate float precision */
			
		/* OPERATORS */
		int na = 3;					/* Declare some dummy variables */
		int nb = 5;
		float fa = 3.0f;
		float fb = 5.0f;
		
		int nc = na + nb; // or na - nb, na * nb ...
		nc = na / nb; // This is bad! Always avoid division involving an integer denominator or integer result - Loss of precision;
		float fc = fa / fb; // This is fine, floating point numbers are good with division;
		fc = na / (float)nb; // This is also okay because the denominator is cast to a float before the division, and the result is a float also.
	}

	/* Main functions are called when the program is run. Creates our class */
	public static void main(String args[]) {
		new Variables();
	}
}
