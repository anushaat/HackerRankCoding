package LinkedLists;

public class PrintInReverse {
	void ReversePrint(Node head){
		if(head!=null){
			ReversePrint(head.next);
			System.out.println(head.data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
