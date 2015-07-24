//import java.util.*;
import ch04_01.*;

public class Assign04
{
	public static void main( String args[] )
	{
		/*
		Set<Integer> E = new LinkedHashSet<Integer>(); // guarantees order on enumeration
		E.add(1);
		E.add(1);
		E.add(2);
		E.add(1);
		E.add(3);
				
		//access via Iterator
		Iterator iterator = E.iterator();
		while( iterator.hasNext() )
		{
						   //cast to int
			int element = (int)iterator.next();
			System.out.println(element);
		}
		*/
		
		LinkedList LL = new LinkedList();
		
		LL.insertAtHead(5);
		LL.insertAtHead(10);
		LL.insertAtHead(2);
		LL.insertAtHead(12);
		LL.insertAtHead(19);
		LL.insertAtHead(5);
		LL.insertAtHead(10);
		LL.insertAtHead(2);
		LL.insertAtHead(12);
		LL.insertAtHead(19);
		LL.insertAtHead(20);	
		LL.insertAtHead(20);		
		LL.insertAtHead(5);
		LL.insertAtHead(10);
		LL.insertAtHead(2);
		LL.insertAtHead(12);
		LL.insertAtHead(19);
		LL.insertAtHead(20);	
				
		System.out.println(LL);
		System.out.println("Length : " + LL.length());
		
		// assignment 4
		LL.removeDuplicates();

		System.out.println(LL);
		System.out.println("Length : " + LL.length());		
		
		
	}
}