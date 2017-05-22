package LeetCode;

public class LinkedList {
	
	Node head;
	int count;
	
	public LinkedList()
	{
		head = null;
		count =0;
	}
	
	public LinkedList(Node newHead)
	{
		head = newHead;
		count =1;
	}
	
	public void add(int newData)
	{
		Node temp= new Node(newData);
		Node current = head;
		
		while (current.getLink()!=null)
		{
			current=current.getLink();
		}
		
		current.setLink(temp);
		count++;
		
	}
	
	public void remove(int index)
	{
		Node current=head;
		for(int i=0;i<index;i++ )
		{
			current = current.getLink();
		}
		Node copy;
		if (current.getLink()!=null)
     	{
		copy = current.getLink();
     	}
		else 
		{
			copy=null;
		}
		for(int i=0;i<index-1;i++ )
		{
			current = current.getLink();
		}
		
		current.setLink(copy);
		count--;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  

	}

}
