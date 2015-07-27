package ch04_01;

import java.util.*; //assign 4

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

	//assignment 3
	public int getDataFromEnd( int n )
	{
		int ln = this.length();
		Node current = this.headNode;
		
		for (int i = 0 ; i < ln - n ; i++ )
		{
			current = current.getNextNode();
		}
		
		return	current.getData();
	}

	//assignment 4 
	/* Write an algorithm to remove duplicates from an unsorted linked list.  
	(You can use the Set provided in the JDK) : http://tutorials.jenkov.com/java-collections/set.html#java-set-example
	Time Complexity? O(n)
	How will you solve it if additional memory is not allowed? > Sort + nettoyage sur place en 1 loop
	*/
	public void removeDuplicates()
	{
		LinkedList tempList = new LinkedList();
		Node current = this.headNode;
		// Les Set ne gardent pas les doublons	
		Set<Integer> E = new LinkedHashSet<Integer>(); // guarantees order on enumeration
		
		// On remplit le Set
		while (current != null)
		{
			E.add(current.getData());
			current = current.getNextNode();
		}
		
		// On remplit la nouvelle liste (le résultat est dans le désordre)
		Iterator iterator = E.iterator();
		while( iterator.hasNext() )
		{
						   //cast to int
			int element = (int)iterator.next();
			tempList.insertAtHead( element );
		}		
		
		this.headNode = tempList.headNode;
	}


	//assignment 5
	/*
	Implement an algorithm to delete a node from somewhere in the middle of a SINGLY linked list, given that you have access only to this node (and of course the subsequent nodes).
	E.g.
	INPUT: The node 'v' from the linked list u->v->w->x->y->z
	RESULT: The new list should look like this u->w->x->y->z
	
	>> Since we cannot access the previous node, instead we can pull the data from the left (the nodes stay the same, its the data that changes place)
	*/
	
	public void deleteNode(Node n) {
		if (n != null && n.getNextNode() != null) {
			n.setData(n.getNextNode().getData()); // copy the data over to n
			n.setNextNode(n.getNextNode().getNextNode()); // next node of n is deleted now
		}
	}
	
	//assignment 6
	/*
	How can you identify if a Linked List is circular? (Think about using two pointers/references)
	*/
	/*
	public boolean isCircular() 
	{
		Node current = this.headNode;
		Node ref = this.headNode;
		
		while (current != null)
		{
			current = current.getNextNode();
			if (current == ref) return true;
		}
		
		return false;
		
	}
	*/

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
