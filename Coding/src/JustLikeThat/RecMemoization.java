package JustLikeThat;

import java.util.Scanner;

public class RecMemoization {
	
	static int[] F = new int[51];
	
	public static int FibMem(int n){
		if(n<=1){
			return n;
		}
		
		if(F[n] != -1){
			return F[n];
		}
		
		F[n] = Fib(n-1) + Fib(n-2);
		return F[n];
	}
	
	public static int Fib(int n){
		if(n<=1){
			return n;
		}
		
		return Fib(n-1) + Fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0; i<51; i++){
			F[i] = -1;
		}
		
		//System.out.println(Fib(n));
		System.out.println(FibMem(n));
		
		

	}

}
