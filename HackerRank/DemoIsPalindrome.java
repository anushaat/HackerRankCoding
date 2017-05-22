import java.util.Scanner;

public class DemoIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("kayak"));
	}
	
	public static boolean isPalindrome(String input){
		StringBuilder inputString = new StringBuilder(input);
		String reverseString = inputString.reverse().toString();
		
		return reverseString.equalsIgnoreCase(input);
	}

}
