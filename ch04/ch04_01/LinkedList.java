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

	public void deleteFromHead()
	{
		this.headNode = this.headNode.getNextNode();
	}
	
	public Node find(int data)
	{
		Node current = this.headNode;
		
		while (current != null)
		{
			if (current.getData() == data) return current;
			current = current.getNextNode();
		}
		
		return null;			
	}

	public int length()
	{
		int length = 0;
		
		Node current = this.headNode;
		
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
		
		Node current = this.headNode;
		
		while (current != null)
		{
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		
		result += "}";
		
		return result;
	}
	
}
