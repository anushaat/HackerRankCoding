package JustLikeThat;

public class BinarySearch {
	
	public static int BinarySearchEx(int[] arr, int n, int x){
		int start = 0;
		int end = n - 1;
		
		while(start<=end){
			int mid = (start + end)/2;
			if(x == arr[mid]){
				return mid;
			}
			else if(x < arr[mid]){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static int BinarySearchRec(int[] arr, int start, int end, int x){
		if(start > end){
			return -1;
		}
		
		int mid = (start+end)/2;
		
		if(x == arr[mid]){
			return mid;
		}
		else if(x<arr[mid]){
			return BinarySearchRec(arr, start, mid-1, x);
		}
		else{
			return BinarySearchRec(arr, mid+1, end, x);
		}
	}
	
	public static int FirstOccurence(int[] arr, int n, int x){
		int start = 0;
		int end = n;
		int result = -1;
		
		while(start<=end){
			int mid = (start + end)/2;
			
			if(x == arr[mid]){
				result = mid;
				end = mid-1;
			}
			else if(x < arr[mid]){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return result;
	}
	
	public static int LastOccurence(int[] arr, int n, int x){
		int start = 0;
		int end = n;
		int result = -1;
		
		while(start<=end){
			int mid = (start + end)/2;
			
			if(x == arr[mid]){
				result = mid;
				start = mid+1;
			}
			else if(x < arr[mid]){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return result;
	}
	
	public static int FindCount(int[] arr, int n, int x){
		int first = FirstOccurence(arr, n, x);
		int last = LastOccurence(arr, n, x);
		
		return (last - first +1);
	}
	
	public static int FindRotationCount(int[] arr, int n){
		int start = 0;
		int end = n-1;
		while(start <= end){
		if(arr[start] <= arr[end]){
			return start;
		}
		
		int mid = (start + end)/2;
		int prev = (mid+n-1)%n;
		int next = (mid+1)%n;
		
		if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
			return mid;
		}
		else if(arr[mid] <= arr[end]){
			end = mid-1;
		}
		else if(arr[mid] >= arr[end]){
			start = mid + 1;
		}
		}
		
		return -1;
	}
	
	public static int CircularArraySearch(int[] arr, int n, int x){
		int start = 0;
		int end = n-1;
		while(start<=end){
			int mid = (start + end)/2;
			if(arr[mid] == x){
				return mid;
			}
			if(arr[mid] <= arr[end]){
				if(x>arr[mid] && x<=arr[end]){
					start = mid + 1;
				}
				else{
					end = mid-1;
				}
			}
			else{
				if(x>=arr[start] && x< arr[mid]){
					end = mid-1;
				}
				else{
					start = mid+1;
				}
			}
		}
		return -1;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 9, 9, 9, 9, 87, 92, 93};
		int[] arrrot = { 9, 11, 15, 23, 87, 92, 93, 1, 5};
		
		System.out.println(BinarySearchEx(arr, 9, 92));
		System.out.println(BinarySearchRec(arr, 0, 9, 93));
		System.out.println(FirstOccurence(arr, 9, 9));
		System.out.println(LastOccurence(arr, 9, 9));
		System.out.println(FindCount(arr, 9, 9));
		System.out.println(FindRotationCount(arrrot, 9));
		System.out.println(CircularArraySearch(arrrot, 9, 15));

	}

}
