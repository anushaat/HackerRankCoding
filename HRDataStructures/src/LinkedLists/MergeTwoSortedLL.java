package LinkedLists;

public class MergeTwoSortedLL {
	
	Node MergeLists(Node headA, Node headB){
		if(headA==null || headB==null){
			return (headA==null) ? headB : headA;
		}
	
		
		if(headA.data<=headB.data){
			headA.next = MergeLists(headA.next, headB);
		}
		
		headB.next = MergeLists(headA, headB.next);
		return headA;
	}

}
