package ch04_01;

public class TestLinkedList
{
	public static void main( String[] args )
	{
		LinkedList<Double> LL = new LinkedList<Double>();
		
		LL.insertAtHead(5.0);
		LL.insertAtHead(10.0);
		/*LL.insertAtHead(2);
		LL.insertAtHead(12);
		LL.insertAtHead(19);
		LL.insertAtHead(20);*/
		
		LL.deleteFromHead();
		
		// Le call de ToString est implicite
		System.out.println(LL);
		System.out.println("Length : " + LL.length());
		
		System.out.println("Find 12 ? : " + LL.find(12.0));
		//System.out.println("Find 77 ? : " + LL.find(77));
	}
}