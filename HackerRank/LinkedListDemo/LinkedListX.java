package LinkedListDemo;

public class LinkedListX {
	
	//properties
	
	Node head;
	int count;
	
	//Constructors
	
	public LinkedListX(){
		head = null;
		count = 0;
	}
	
	public LinkedListX(Node head){
		this.head = head;
		count = 1;
	}
	
	//Methods
	
	public void add(int newData){
		Node newNode = new Node(newData);
		Node curr = head;
		if(head==null){
			curr.setNext(null);
		}
		while(curr.getNext() != null){
			curr = curr.getNext();
		}
		curr.setNext(newNode);
		count++;
	}
	
	public int get(int index){
		if(index<=0){
			return -1;
		}
		
		Node curr = head;
		for(int i=1; i<index; i++){
			curr = curr.getNext();
		}
		
		return curr.getData();
	}
	
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		
		return false;
	}
	
	public void remove(){
		Node curr = head;
		
		if(head.next == null){
			count--;
		}
		
		while(curr.getNext().getNext() != null){
			curr = curr.getNext();
		}
		
		curr.setNext(null);
		count--;
	}
	
	
	public static void printEles(Node head){
		if(head != null){
			System.out.print(head.getData());
			printEles(head.next);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListX linkedlist = new LinkedListX();
		linkedlist.add(2);
		linkedlist.add(13);
		linkedlist.add(4);
		linkedlist.add(9);
		
		
		System.out.println(linkedlist.get(3));
		linkedlist.remove();
		

	}

}
