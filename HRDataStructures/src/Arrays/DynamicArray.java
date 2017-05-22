package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		int lastAns = 0;
		
		List<List> seqList = new ArrayList();
		
		for(int i=0; i<N; i++){
			seqList.add(new ArrayList<Integer>()); 
		}
		
		for(int i=0; i<Q; i++){
			int cmd = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			List<Integer> seq = seqList.get((x^lastAns)%N);
			if(cmd==1){
				seq.add(y);
			}
			else{
				lastAns = seq.get(y%seq.size());
				System.out.println(lastAns);
			}
		}
		
		
	}

}
