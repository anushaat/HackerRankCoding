import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		int n = scan.nextInt();
		
		for(int i = 0; i<n; i++){
			String name = scan.next();
			int num = scan.nextInt();
			myMap.put(name, num);
		}
		
		while(scan.hasNext()){
			String str = scan.next();
			
			if(myMap.containsKey(str)){
				System.out.println(str+"="+myMap.get(str));
			}
			else{
				System.out.println("Not Found");
			}
		}
	}

}
