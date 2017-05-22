package LinkedLists;

public class InsertAtHeadOfLL {
	
	Node Insert(Node head, int x){
		Node current = new Node();
		current.data = x;
		current.next = head;
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
