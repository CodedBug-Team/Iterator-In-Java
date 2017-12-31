import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class IteratorSampleExample {

	public static void main(String args[]) {
	      // Create an array list
	      ArrayList<String> listObject = new ArrayList<String>();
	      
	      // add elements to the array list
	      listObject.add("Charles");
	      listObject.add("listObjectice");
	      listObject.add("Elena");
	      listObject.add("Brook");
	      listObject.add("Dunkin");
	      listObject.add("Fraud");

	      // Use iterator to display contents of listObject
	      System.out.print("OriginlistObject contents of listObject: ");
	      Iterator<String> iteratorObject = listObject.iterator();
	      
	      while(iteratorObject.hasNext()) {
	         Object element = iteratorObject.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      
	      // Modify objects being iterated
	      ListIterator<String> literatorObject = listObject.listIterator();
	      
	      while(literatorObject.hasNext()) {
	         Object element = literatorObject.next();
	         literatorObject.set(element + "+");
	      }
	      System.out.print("Modified contents of listObject: ");
	      iteratorObject = listObject.iterator();
	      
	      while(iteratorObject.hasNext()) {
	         Object element = iteratorObject.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();

	      // Now, display the list backwards
	      System.out.print("Modified list backwards: ");
	      
	      while(literatorObject.hasPrevious()) {
	         Object element = literatorObject.previous();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	   }
	}

