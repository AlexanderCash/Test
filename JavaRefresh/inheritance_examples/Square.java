package inheritance_examples;

/**
 * A class representing a square. 
 * Implements the abstract shape class.
 */
public class Square extends Shape {

	/** Constructor method */
	public Square(int nSize) {
		/* Must call the constructor method of superclass */
		super(nSize);
	}

	/** Implementation of the getName method */
	String getName() {
		return "Square";
	}
}
