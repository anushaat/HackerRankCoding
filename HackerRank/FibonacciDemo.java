
public class FibonacciDemo {
	static int n1 = 0, n2 = 1, n3=0;
	
	public static int Fibonacci(int n){
		
		/*if(n <= 0){
			return 0;
		}
		else{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			
				//n1 = n1 + n2;
				System.out.print(n3+" ");
				Fibonacci(n-1);
			}
			return n3;*/
		
		
		if(n==1 || n==2){
			return 1;
		}
		int n1 =1, n2=1, n3=1;
		for(int i=3; i<=n; i++){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
		}
		return n3;
	}
	
	public static int fibonacci2(int n){
		if(n==0){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		return fibonacci2(n-1) + fibonacci2(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++){
		System.out.print(Fibonacci(i) + " ");
		
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++){
			System.out.print(fibonacci2(i)+ " ");
			}
		
		
	}

}
