package LinkedLists;

public class CompareTwoLL {
	
	int CompareLists(Node headA, Node headB){
		if(headA!=null && headB!=null){
			if(headA.data == headB.data){
			return CompareLists(headA.next, headB.next);
			}
			else
				return 0;
		}
		else if(headA==null && headB==null){
			return 1;
		}
		else
			return 0;
	}

}
