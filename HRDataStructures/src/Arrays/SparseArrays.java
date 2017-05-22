package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<N; i++){
			arr.add(scan.next());
		}
		int Q = scan.nextInt();
		
		for(int i=0; i<Q; i++){
			String str = scan.next();
				int count = 0;
				for(String sub : arr){
					if(sub.equals(str)){
						count++;
					}
				}
				System.out.println(count);
		}

	}

}
