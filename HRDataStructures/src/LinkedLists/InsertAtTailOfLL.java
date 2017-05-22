package LinkedLists;

public class InsertAtTailOfLL {
	Node Insert(Node head, int data){
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		
		if(head == null){
			head = temp;
			return head;
		}
		
		Node current = head;
		
		while(current.next!=null){
			current = current.next;
		}
		
		current.next = temp;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
