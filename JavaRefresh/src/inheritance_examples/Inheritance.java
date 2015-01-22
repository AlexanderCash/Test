package inheritance_examples;

/**
 * Class to demonstrate inheritance
 *
 */
public class Inheritance {
	/* Declare some shape variables */
	Triangle tri;
	Square sq;
	
	/** Constructor method */
	public Inheritance() {
		/* Instantiate the shapes */
		tri = new Triangle(50);
		sq = new Square(100);
		
		/* Print out shape info */
		System.out.println("" + tri.getName() + ". Size: " + tri.getSize());
		System.out.println("" + sq.getName() + ". Size: " + sq.getSize());
	}
	
	public static void main(String args[]) {
		new Inheritance();
	}
}
