package ch04_01;

public class LinkedList<T>
{
	private Node<T> headNode;
	
	public void insertAtHead( T data )
	{
		Node<T> newHead = new Node<T>( data );
		newHead.setNextNode(this.headNode);
		this.headNode = newHead;
	}

	public void deleteFromHead()
	{
		this.headNode = this.headNode.getNextNode();
	}
	
	public Node<T> find(T data)
	{
		Node<T> current = this.headNode;
		
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
		
		Node<T> current = this.headNode;
		
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
		
		Node<T> current = this.headNode;
		
		while (current != null)
		{
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		
		result += "}";
		
		return result;
	}
	
}
