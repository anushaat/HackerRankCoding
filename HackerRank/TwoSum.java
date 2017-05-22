import java.util.Scanner;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] n = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target)
                {
                	n[0] = i;
                	n[1] = j;
                }
            }
            
        }
        return(n); 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		final String intLine = scan.nextLine();
		final String[] splitIntLine = intLine.split(" ");
		final int[] arr = new int[splitIntLine.length];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(splitIntLine[i]);
		}
		
		scan.nextLine();
		
		int num = scan.nextInt();	
		
		scan.close();
		
		TwoSum ts = new TwoSum();
		ts.twoSum(arr, num);
		
	
	       
	}

}
