package ch04_02;

public class DNode
{
	private int data;
	private DNode nextNode;
	private DNode prevNode;
	
	public DNode(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public DNode getNextNode()
	{
		return this.nextNode;
	}

	public DNode getPrevNode()
	{
		return this.prevNode;
	}
	
	public void setdData(int data)
	{
		this.data = data;
	}
	
	public void setNextNode(DNode nextNode)
	{
		this.nextNode = nextNode;
	}

	public void setPrevNode(DNode prevNode)
	{
		this.prevNode = prevNode;
	}
	
	@Override
	public String toString()
	{
		return "Data: " + this.data;
	}
	
}