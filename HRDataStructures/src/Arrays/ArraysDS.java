package Arrays;
import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		for(int i=n-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}

	}

}
