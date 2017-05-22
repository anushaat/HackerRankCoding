import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int noOfInputs = scan.nextInt();
		
		
		while(noOfInputs > 0){
			String inputString = scan.next();
			for(int i=0; i<inputString.length(); i++){
				if(i%2 == 0){
					System.out.print(inputString.charAt(i));
				}
			}
			
			System.out.print(" ");
			
			for(int i=0; i<inputString.length(); i++){
				if(i%2 == 1){
					System.out.print(inputString.charAt(i));
				}
			}
			noOfInputs = noOfInputs-1;
			System.out.println();
		}
			
	}

}
