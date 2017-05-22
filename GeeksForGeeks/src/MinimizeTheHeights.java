import java.util.Scanner;

public class MinimizeTheHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++){
			int K = scan.nextInt();
			int N = scan.nextInt();
			int[] arr = new int[N];
			for(int j=0; j<N; j++){
				arr[j] = scan.nextInt();
				if(j==0){
					arr[j] += K;
				}
				else {
					arr[j] -= K;
				}
				
			}
			System.out.println(arr[N-1] - arr[0]);
		}
		

	}

}
