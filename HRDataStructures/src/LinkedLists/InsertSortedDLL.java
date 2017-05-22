package LinkedLists;

public class InsertSortedDLL {
	Nodex SortedInsert(Nodex head, int data){
		Nodex newNode = new Nodex();
		newNode.data = data;
		
		if(head == null){
			return newNode;
		}
		else if(data <= head.data){
			newNode.next = head;
			head.prev = newNode;
			return newNode;
		}
		else{
			Nodex rest = SortedInsert(head.next, data);
			rest.prev = head;
			head.next = rest;
			return head;
		}
	}

}
