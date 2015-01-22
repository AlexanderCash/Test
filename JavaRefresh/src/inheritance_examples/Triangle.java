package inheritance_examples;

/**
 * A class representing a triangle. 
 * Implements the abstract shape class.
 */
public class Triangle extends Shape {

	/** Constructor method */
	public Triangle(int nSize) {
		/* Must call the constructor method of superclass */
		super(nSize);
	}

	/** Implementation of the getName method */
	String getName() {
		return "Triangle";
	}
}
