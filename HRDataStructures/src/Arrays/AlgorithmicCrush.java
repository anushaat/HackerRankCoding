package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmicCrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		long[] arr = new long[N+1];
		for(int i=0; i<M; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			long k = scan.nextLong();
			
			arr[a-1] += k;
			arr[b] -= k;
			}
			
		long sum=0, max=0;
		for(int i=0; i<N; i++){
			sum += arr[i];
			max = Math.max(sum, max);
		}
		System.out.println(max);

	}

}
