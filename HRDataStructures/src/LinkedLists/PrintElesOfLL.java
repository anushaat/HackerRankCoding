package LinkedLists;

public class PrintElesOfLL {
	
	static void print(Node head){
		if(head!=null){
			System.out.print(head.data);
			print(head.next);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(null);
	}

}
