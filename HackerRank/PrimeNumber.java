import java.util.Scanner;

public class PrimeNumber {
	
	public static void isPrime(int n){
		boolean flag = false;
		if(n==1){
			flag = false;
		}
		else{
			for(int i=2; i*i<=n; i++){
				if(n%i==0){
					flag = true;
					break;
				}
			}
		}
		
		if(flag == true){
			System.out.println("Prime" + n);
		}
		else{
			System.out.println("Not prime"+ n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<=T; i++){
			int n = scan.nextInt();
			isPrime(n);
		}

	}

}
