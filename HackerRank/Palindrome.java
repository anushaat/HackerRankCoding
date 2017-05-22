
public class Palindrome {
	
	public static int reverse(int n){
		int rev = 0;
		while(n!=0){
			rev = rev*10 + n%10;
			n = n/10;
		}
		
		return rev;
	}
	
	public static boolean isPalindrome(int n){
		if(n == reverse(n)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {0, 1, 25, 1245, 7654, 88888888, 9889, 1119111, 543212345};
		
		for(int nums: num){
			System.out.println(isPalindrome(nums));
		}
	}

}
