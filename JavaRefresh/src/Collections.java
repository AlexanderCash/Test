/**
 * Collections.Java
 * 
 * Ali Jewers
 * 2015
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Class to demonstrate Java collections
 *
 */
public class Collections {
	/* An array list is an example of a collection */
	List<Integer> arrayList;
	
	/** Constructor method */
	public Collections() {
		/* Instantiate the array list */
		arrayList = new ArrayList<Integer>();
		
		/* Values are added to the end of the list */
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(10));
		
		System.out.println(arrayList.toString());
		
		/* Items can be added by index */
		arrayList.add(2, new Integer(44));
		arrayList.add(new Integer(7));
		
		/* Items can be removed by index */
		arrayList.remove(3);
		
		System.out.println(arrayList.toString());
	}
	
	
	public static void main(String args[]) {
		new Collections();
	}
}
