import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesInArray {

	public static boolean bruteForce(int[] input){
		for(int i=0; i<input.length; i++){
			for(int j=0; j<input.length; j++){
				if(input[i] == input[j] && i!=j){
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean usingSet(int[] input){
		List inputList = Arrays.asList(input);
		Set inputSet = new HashSet(inputList);
		
		if(inputSet.size() < inputList.size()){
			return true;
		}
		
		return false;
	}
	
	
	public static void usingAdd(int[] input){
		Set tempSet = new HashSet();
		
		for(int a : input){
			if(!tempSet.add(a)){
				System.out.println(a + " ");
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = {1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9};
		
		System.out.println(bruteForce(arr1) + " " + bruteForce(arr2));
		System.out.println(usingSet(arr1) + " " + usingSet(arr2));
		usingAdd(arr1); 
		usingAdd(arr2);
		

	}

}
