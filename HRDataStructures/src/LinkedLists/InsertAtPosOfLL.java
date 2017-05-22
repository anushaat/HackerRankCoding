package LinkedLists;

public class InsertAtPosOfLL {
	
	Node Insert(Node head, int data, int position){
		Node current = new Node();
		Node temp = head;
		
		if(head==null){
			current.data = data;
			current.next =null;
			return current;
		}
		
		current.data = data;
		//insert at position 0
		if(position == 0){
			current.next = head;
			temp = current;
			return temp;
		}
			for(int i=1; i<position && head.next!=null; i++){
				head = head.next;
			}
			
			if(head.next!=null){
				current.next = head.next;
				head.next = current;
			}
			else{
				head.next = current;
			}
			
			return temp;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
