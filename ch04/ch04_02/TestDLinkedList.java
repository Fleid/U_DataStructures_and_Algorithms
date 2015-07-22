package ch04_02;

public class TestDLinkedList
{
	public static void main( String[] args )
	{
		DLinkedList LL = new DLinkedList();
		
		LL.insertAtHead(5);
		LL.insertAtHead(10);
		LL.insertAtHead(2);
		LL.insertAtHead(12);
		LL.insertAtHead(19);
		LL.insertAtHead(20);
		
		//LL.deleteFromHead();
		
		// Le call de ToString est implicite
		System.out.println(LL);
		System.out.println("Length : " + LL.length());
		
		//System.out.println("Find 12 ? : " + LL.find(12));
		//System.out.println("Find 77 ? : " + LL.find(77));
	}
}