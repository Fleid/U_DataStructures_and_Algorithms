package ch04_02;

public class DLinkedList
{
	private DNode headNode;
	
	public void insertAtHead( int data )
	{
		DNode newHead = new DNode( data );
		newHead.setNextNode(this.headNode);
		//Pas besoin d'un newHead.setPrevNode() : il est null
		if (this.headNode != null) this.headNode.setPrevNode(newHead);
		
		this.headNode = newHead;
	}
/*
	public void deleteFromHead()
	{
		this.headNode = this.headNode.getNextNode();
		this.headNode.setPrevNode(null);
	}
	
	public DNode find(int data)
	{
		DNode current = this.headNode;
		
		while (current != null)
		{
			if (current.getData() == data) return current;
			current = current.getNextNode();
		}
		
		return null;			
	}
*/
	public int length()
	{
		int length = 0;
		
		DNode current = this.headNode;
		
		while (current != null)
		{
			length++;
			current = current.getNextNode();
		}
		
		return length;		
	}
	
	@Override
	public String toString()
	{
		String result = "{";
		
		DNode current = this.headNode;
		
		while (current != null)
		{
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		
		result += "}";
		
		return result;
	}
	
}
