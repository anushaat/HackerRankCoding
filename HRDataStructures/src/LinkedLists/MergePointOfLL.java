package LinkedLists;

public class MergePointOfLL {
	
	int FindMergeNode(Node headA, Node headB){
		Node currA = headA;
		Node currB = headB;
		
		while(currA != currB){
			if(currA.next == null){
				currA = headB;
			}
			else{
				currA = currA.next;
			}
			
			if(currB.next == null){
				currB = headA;
			}
			else{
				currB = currB.next;
			}
		}
		
		return currB.data;
	}

}
