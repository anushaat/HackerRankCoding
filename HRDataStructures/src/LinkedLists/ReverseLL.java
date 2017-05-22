package LinkedLists;

public class ReverseLL {
	
	Node Reverse(Node head){
		if(head==null || head.next==null){
			return head;
		}
		
		Node temp = Reverse(head.next);
		head = head.next.next;
		head.next=null;
		
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
