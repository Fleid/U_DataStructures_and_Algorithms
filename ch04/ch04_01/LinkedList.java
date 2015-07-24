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
	
	// assignment 1
	public void moveLastToHead( int n )
	{
		Node current = this.headNode;
		Node last = this.headNode;
		
		//Maintaining the length as a member variable could help! (One less loop)
		int ln = this.length();
		
		//La sortie du dernier devient le premier
		for (int i = 0 ; i < ln - 1 ; i++ ) {
			last = last.getNextNode();
		}
		last.setNextNode(this.headNode);
		
		//La head devient le Nième
		for (int i = 0 ; i < ln - n ; i++ ) {
			current = current.getNextNode();
		}
		this.headNode = current;
		
		//On ferme la sortie
		for (int i = 0 ; i < ln - 1 ; i++ ) {
			current = current.getNextNode();
		}
		current.setNextNode(null);		
	}
	
	//assignment 2
	public void reverse()
	{
		LinkedList tempList = new LinkedList();
		Node current = this.headNode;	
		
		while (current != null)
		{
			tempList.insertAtHead(current.getData());
			current = current.getNextNode();
		}
		
		this.headNode = tempList.headNode;
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
