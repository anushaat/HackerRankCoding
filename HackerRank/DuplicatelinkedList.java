import java.util.Scanner;

/*class Node{
	int data;
	Node next;
	
	Node(int d){
		d = data;
		next = null;
	}
	
}*/

public class DuplicatelinkedList{
	
/*	public static Node removeDuplicates(Node head){
		Node node = head;
		if(head == null){
			return null;
		}
		while(head.next!=null){
			if(head.data == head.next.data){
				head.next = head.next.next;
			}
			else{
				head = head.next;
			}
		}
		return node;
	}
	
	public static Node insert(Node head, int data){
		Node p = new Node(data);
		if(head == null){
			head = p;
		}
		
		else if(head.next == null){
			head.next = p;
		}
		else{
			Node start = head;
			while(start.next != null){
				start.next = start.next.next;
				start.next = p;
			}	
		}
		return head;
	}
	
	public static void display(Node head){
		Node start = head;
		while(start!=null){
			System.out.print(start.data + " ");
			start = start.next;
		}
	}*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Node head = null;
		int T = scan.nextInt();
		/*while(T-->0){
			int ele = scan.nextInt();
			head = insert(head, ele);
		}
		
		head= removeDuplicates(head);
		display(head);*/
		scan.close();

	}

}
