import java.util.HashMap;

public class RunTimePractice {
	
	public static int findNumsOfRepetition(String s, char c){
		//Linear time; O(n) time
		int sum = 0;
		for(int i=0; i<s.length(); i++){//1...n+1...n
			if(s.charAt(i) == c){//n
				sum++;//n
			}
		}
		return sum;//1
		
	}
	
	public static int[] findNumsOfRepetitionV1(String s, char[] c){
		//Quad time; O(n * m) time
		int[] sums = new int[c.length];//1
		for(int i=0; i<s.length(); i++){//1...n+1...n
			for(int j=0; j<c.length; j++){//n...n*m+1...n*m
				if(s.charAt(i) == c[j]){//n*m
					sums[j] = sums[j] + 1;//n*m
				}
			}
		}
		return sums;//1
	}
	
	public static int[] findNumsOfRepetitionV2(String s, char[] c){
		int[] sums = new int[c.length];//1
		HashMap<Character, Integer> map = new HashMap();
		for(int i=0; i<s.length(); i++){
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), 1);
			}
			else{
				int sum = map.get(s.charAt(i));
				map.put(s.charAt(i), sum+1);
			}
		}
		
		for(int i=0; i<c.length; i++){
			int sum;
			if(!map.containsKey(c[i])){
				sums[i] = 0;
			}
			else{
				sums[i] = map.get(c[i]);
			}
		}
		return sums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println(findNumsOfRepetition("ababfcaaaaaghsgavhgsavdgasv", 'a'));
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Test " + duration +"ms.");
		
		System.out.println("---------------------------------");
		char[] c = {'c', 'a', 'd', 'd'};
		long startTimeV1 = System.currentTimeMillis();
		System.out.println(findNumsOfRepetitionV1("ababfcaaaaaghsgjabfhsbdgjhbwauweharfioeakjrbiuabfsjmbdgiwasgdbwiutgbwaiuegsbgiurwjsgbiuresjgbeiuskjrgbleijkrbgiukjsgerbgiueksjhrbguiskjehrgbaiuwsesbglisruwkjthavhgsavdgasv", c));
		long endTimeV1 = System.currentTimeMillis();
		long durationV1 = endTimeV1 - startTimeV1;
		System.out.println("Test " + durationV1 +"ms.");
		
		System.out.println("---------------------------------");
		long startTimeV2 = System.currentTimeMillis();
		System.out.println(findNumsOfRepetitionV2("ababfcaaaaaghsgjabfhsbdgjhbwauweharfioeakjrbiuabfsjmbdgiwasgdbwiutgbwaiuegsbgiurwjsgbiuresjgbeiuskjrgbleijkrbgiukjsgerbgiueksjhrbguiskjehrgbaiuwsesbglisruwkjthavhgsavdgasv", c));
		long endTimeV2 = System.currentTimeMillis();
		long durationV2 = endTimeV2 - startTimeV2;
		System.out.println("Test " + durationV2 +"ms.");

	}

}
