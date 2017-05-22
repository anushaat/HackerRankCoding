package StackDemo;

public class Stack {
	private static class Node{
		private int data;
		private Node next;
		
		private Node(int data){
			this.data = data;
		}
	}
	
	private Node top;
	
	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		return false;
	}
	
	public int peek(){
		return top.data;
	}
	
	public void add(int data){
		Node node = new Node(data);
		
		if(top!=null){
			node.next = null;
		}
		
		top = node;
	}
	
	public int remove(){
		int data = top.data;
		top = top.next;
		
		return data;
	}

}
