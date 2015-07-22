package ch04_01;

public class TestLinkedList
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
		
		// Le call de ToString est implicite
		System.out.println(LL);
	}
}