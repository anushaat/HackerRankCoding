package LinkedLists;

public class ReverseDLL {
	
	Nodex Reverse(Nodex head){
		if(head == null || head.next == null){
			return head;
		}
		
		Nodex temp = Reverse(head.next);
		head.next.next = head;
		head.next = null;
		
		return temp;
	}

}
