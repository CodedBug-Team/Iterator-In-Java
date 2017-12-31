import java.util.ArrayList;
import java.util.Iterator;
public class IteratorSampleExample2 {
	
	public static void main(String[] args)
    {
        ArrayList<Integer> listObject = new ArrayList<Integer>();
 
        for (int i = 0; i < 10; i++)
            listObject.add(i);
 
        System.out.println(listObject);
 
        // at beginning iteratorObject(cursor) will point to
        // index just before the first element in listObject
        Iterator<Integer> iteratorObject = listObject.iterator();
 
        // checking the next element availabilty
        while (iteratorObject.hasNext())
        {
            //  moving cursor to next element
            int i = (Integer)iteratorObject.next();
 
            // getting even elements one by one
            System.out.print(i + " ");
 
            // Removing odd elements
            if (i % 2 != 0)
               iteratorObject.remove(); 
        }
        System.out.println(); 
        System.out.println(listObject);
    }

}
