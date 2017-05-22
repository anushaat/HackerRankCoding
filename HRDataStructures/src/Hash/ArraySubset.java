package Hash;

import java.util.Hashtable;

public class ArraySubset {
	
	public static boolean checkIfSubset(int[] arr1, int[] arr2){
		
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		for(int i=0; i<arr1.length; i++){
			ht.put(i, arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++){
			if(!ht.containsValue(arr2[i])){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10, 5, 2, 23, 19};
		int[] arr2 = {19, 5, 3};
		
		System.out.println(checkIfSubset(arr1, arr2));
		
		

	}

}