
public class StringReverse {
	
	public static String reverseIteration(String str){
		StringBuilder strBuilder = new StringBuilder();
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--){
			strBuilder.append(ch[i]);
		}
		return strBuilder.toString();
		
	}
	
	
	public static String reverseRecursion(String str){
		if(str.length()<2){
			return str;
		}
		//System.out.println(reverseRecursion(str.substring(1)) + str.charAt(0));
		return reverseRecursion(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sony is going to introduce Internet TV soon";
		String reverseStr = new StringBuffer(str).reverse().toString();
		
		System.out.println("Reverse: " + reverseStr);
		System.out.println("Iteration: " + reverseIteration(str));
		System.out.println("Recursion: " + reverseRecursion(str));
	}

}
