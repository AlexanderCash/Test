package inheritance_examples;

/**
 * Abstract Shape class to demonstrate inheritance in Java
 *
 */
public abstract class Shape {
	private int size;
	
	/** Constructor method */
	public Shape(int nSize) {
		size = nSize;
	}
	
	/** Abstract method to return the shapes name. Implemented in subclass */
	abstract String getName();
	
	/** 
	 * Non-abstract method to return the shapes size.
	 *  Same for all subclasses so implemented here
	 */
	public int getSize() {
		return size;
	}
}
