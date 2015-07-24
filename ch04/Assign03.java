import ch04_01.*;

public class Assign03
{
	public static void main( String[] args )
	{
		LinkedList LL = new LinkedList();
		
		LL.insertAtHead(5);
		LL.insertAtHead(10);
		LL.insertAtHead(2);
		LL.insertAtHead(12);
		LL.insertAtHead(19);
		LL.insertAtHead(20);		
		
		System.out.println(LL);
		System.out.println("Length : " + LL.length());
		
		// assignment 3
		System.out.println( LL.getDataFromEnd(2) );
		
	}
}