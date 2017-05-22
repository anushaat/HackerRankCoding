package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int g = scan.nextInt();
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		for(int i=0; i<g; i++){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int x = scan.nextInt();
			
			int[] a = new int[n];
			for(int j=0; j<n; j++){
				a[j] = scan.nextInt();
			}
			
			int[] b = new int[m];
			for(int j=0; j<m; j++){
				b[j] = scan.nextInt();
			}
			
			for(int j=0; j<n; j++){
				st1.push(a[n-1-j]);
			}
			
			for(int j=0; j<m; j++){
				st2.push(b[m-1-j]);
			}
			
			int sum=0, count=0;
			
			while(!st1.isEmpty() && !st2.isEmpty()){
					
					if(st1.peek() <= st2.peek()){
						
						sum += st1.peek();
						st1.pop();
						
					
					if(sum > x){
						break;
					}
					else{
						count++;
					}
					}
					else{

					sum += st2.peek();
					st2.pop();
					//count++;

					if(sum > x){
						break;
					}
					else{
						count++;
					}
					}

				
			}
			System.out.println(sum + " " +count);
		}

	}

}