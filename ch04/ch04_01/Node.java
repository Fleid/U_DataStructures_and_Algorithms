package ch04_01;

public class Node<T>
{
	private T data;
	private Node<T> nextNode;
	
	public Node(T data)
	{
		this.data = data;
	}
	
	public T getData()
	{
		return this.data;
	}
	
	public Node<T> getNextNode()
	{
		return this.nextNode;
	}
	
	public void setdData(T data)
	{
		this.data = data;
	}
	
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString()
	{
		return "Data: " + this.data;
	}
	
}