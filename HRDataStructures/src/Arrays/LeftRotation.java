package Arrays;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[(i+n-d)%n] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++){
			System.out.print(arr[i] +" ");
		}


	}

}
