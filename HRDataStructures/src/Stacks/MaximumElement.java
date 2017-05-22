package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> largeST = new Stack<Integer>();
		largeST.push(0);
		
		for(int i=0; i<n; i++){
			int choice = scan.nextInt();
			if(choice == 1){
				st.push(scan.nextInt());
				if(st.peek() >= largeST.peek()){
					largeST.push(st.peek());
				}
			}
			
			else if(choice == 2){
				if(st.peek() == largeST.peek()){
					largeST.pop();
				}
				
				st.pop();
				
			}
			
			else{
				System.out.println(largeST.peek());
			}
		}
		
		scan.close();

	}

}
