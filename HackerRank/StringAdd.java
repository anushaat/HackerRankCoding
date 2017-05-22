import java.util.ArrayList;
import java.util.Scanner;

public class StringAdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder stbr = new StringBuilder(str);
		int n = scan.nextInt();
		for(int i=0; i<n; i++){
			String sup =" "+scan.next()+" ";
			if(str.contains(sup)){
				int j = stbr.indexOf(sup);
				while(j>=1){
					stbr.insert(j+1, "<b>");
					j+=3;
					stbr.insert(j+sup.length()-1, "</b>");
					j=stbr.indexOf(sup,j+1);
				}
					
			}
		}
		
		
				
		System.out.println(stbr.toString());
		
	
	}

}
