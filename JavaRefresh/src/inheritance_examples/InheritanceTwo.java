package inheritance_examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to demonstrate how abstract classes can be used in collections
 *
 */
public class InheritanceTwo {
	/* Declare a list of shapes */
	private List<Shape> shapeList;
	
	/** Constructor method */
	public InheritanceTwo() {
		/* Instantiate the list as an array list of shapes */
		shapeList = new ArrayList<Shape>();
		
		/* 
		 * Add three shapes to the list.
		 * Note that both triangles and squares can be in 
		 * the same list. This is the power of inheritance.
		 */
		shapeList.add(new Triangle(10));
		shapeList.add(new Square(100));
		shapeList.add(new Triangle(5));
		
		/* Print out the shapes in order */
		for(int i = 0; i < shapeList.size(); i++) {
			System.out.println(i + ": " + shapeList.get(i).getName());
		}
	}
	
	public static void main(String args[]) {
		new InheritanceTwo();
	}
}
