package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		Stack<Integer> st3 = new Stack<>();
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
        int[] arr1 = new int[n1];
		for(int i=0; i<n1; i++){
            arr1[i] = scan.nextInt();
			sum1 += arr1[i];
		}
        
        for(int i=0; i<n1; i++){
            st1.push(arr1[n1-1-i]);
        }
		
        int[] arr2 = new int[n2];
		for(int i=0; i<n2; i++){
            arr2[i] = scan.nextInt();
			sum2 += arr2[i];
		}
        
        for(int i=0; i<n2; i++){
            st2.push(arr2[n2-1-i]);
        }
        
        int[] arr3 = new int[n3];
		for(int i=0; i<n3; i++){
            arr3[i] = scan.nextInt();
			sum3 += arr3[i];
		}
        
        for(int i=0; i<n3; i++){
            st3.push(arr3[n3-1-i]);
        }
		
		while(sum1 != sum2 || sum1 != sum3){
            
            if(st1.isEmpty() || st2.isEmpty() || st3.isEmpty()){
                System.out.println(0);
                return;
            }
			
			if(sum1 == findMax(sum1, sum2, sum3)){
				sum1 = sum1 - st1.peek();
                st1.pop();
			}
			
			if(sum2 == findMax(sum1, sum2, sum3)){
				sum2 = sum2 - st2.peek();
                st2.pop();
			}
			
			if(sum3 == findMax(sum1, sum2, sum3)){
				sum3 = sum3 - st3.peek();
                st3.pop();
			}
			
		}
		
		System.out.println(sum1);
		scan.close();

    }
    
    
    private static int findMax(int sum1, int sum2, int sum3){
        return Math.max(Math.max(sum1, sum2), sum3);
    }


}
