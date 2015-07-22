package ch04_01;

public class LinkedList
{
	private Node headNode;
	
	public void insertAtHead( int data )
	{
		Node newHead = new Node( data );
		newHead.setNextNode(this.headNode);
		this.headNode = newHead;
	}
	
	@Override
	public String toString()
	{
		String result = "{";
		
		Node current = this.headNode;
		
		while (current != null)
		{
			result += current.toString() + ",";
			current = current.getNextNode();
		}
		
		result += "}";
		
		return result;
	}
	
}
