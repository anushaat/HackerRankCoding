package LeetCode;

public class Node {
	
	int data;
	Node next;

	public int getData()
	{
		return data;
	}
	public void setData(int newData)
	{
		data= newData;
	}
	public Node getLink()
	{
		return next;
	}
	public void setLink(Node newNext)
	{
		next = newNext;
	}
	
	public Node()
	{
		
	}
	
	public Node(int newData)
	{
		data=newData;
		next=null;
	}
	
	public Node(int newData, Node newLink)
	{
		data=newData;
		next=newLink;
	}
	
	
	
}
