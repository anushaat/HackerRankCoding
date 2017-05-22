package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	
	public static boolean CheckParanthesis(String str){
		Stack<Character> st = new Stack<>();
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if(c == '(' || c == '{' || c == '['){
				st.push(str.charAt(i));
			}
			
			else if(c == ']'){
				if(st.isEmpty()) return false;
				if(st.pop() != '[') return false;
			}
			
			else if(c == '}'){
				if(st.isEmpty() || st.pop() != '{') {return false;}
			}
			
			else if(c == ')'){
				if(st.isEmpty() || st.pop() != '(') {return false;}
			}
			
		}
		return st.isEmpty();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(n>0){
			String str = scan.next();
			if(CheckParanthesis(str) ==true){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			n--;
		}
		
		scan.close();

	}

}