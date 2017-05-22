import java.util.Arrays;
import java.util.List;

public class DemoStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> trees = Arrays.asList("oak", "pine", "fir", "ash", "birch", "elm", "yew");
		System.out.println(listToString(trees));
		System.out.println(listWithSeparator(trees, ","));

	}
	
	private static String listToString(List<String> list){
		StringBuilder sb = new StringBuilder();
		
		for(String el: list){
			sb.append(el).append(" ");
		}
		return sb.toString();
	}
	
	private static String listWithSeparator(List<String> list, String separator){
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		
		for(String el: list){
			if(first)
				first = false;
			else{
				sb.append(separator);
			}
			sb.append(el);
		}
		return sb.toString();
	}

}
