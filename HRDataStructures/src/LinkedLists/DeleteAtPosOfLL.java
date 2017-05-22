package LinkedLists;

public class DeleteAtPosOfLL {
	
	Node RecDelete(Node head, int position){
		if(position == 0){
			return head.next;
		}
		
		head.next = RecDelete(head.next, position-1);
		return head;
	}
	
	Node Delete(Node head, int position){
		if(position == 0 || head == null){
			return head.next;
		}
		
		Node prev = head;
		Node curr = head;
		
		for(int i=0; i<position; i++){
			prev = curr;
			curr = curr.next;
		}
		
		prev.next = curr.next;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
