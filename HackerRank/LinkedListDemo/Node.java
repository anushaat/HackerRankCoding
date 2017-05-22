package LinkedListDemo;

public class Node {
	
	Node next;
	int data;
	
	//Constructors
	
	public Node(int data){
		this.data = data;
		next = null;
	}
	
	public Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
	
	//Getters and Setters
	
	public int getData(){
		return data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNext(Node next){
		this.next = next;
	}

}
