import java.util.Scanner;

public class TrailingZeros {
	
	public static int factorial(int n){
		int count=0;
		for(int i=5; n/i>=1; i*=5){
			count+=n/i;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
		scan.close();

	}

}
