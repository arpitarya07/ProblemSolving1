package searching;

public class BinarySearch {
	
	private void binarySearchUsingIteration(int[] arr, int value) {
		int size = arr.length;
		int beg=0, end=size, mid=0;
		
		while(beg<=end) {
			mid = (beg+end)/2;
			
			if(arr[mid]==value) {
				System.out.print("Value "+value+" found at index: "+mid);
				return;
			}
			else if(value<arr[mid]) {
				end=mid-1;	
			}
			else {
				beg=mid+1;
			}
		}
		System.err.println("Value not found");
	}
	
	private void binarySearchUsingRecursion(int[] arr, int value, int beg, int end) {
	

			int mid = (beg+end)/2;
			
			if(beg>end) {
				System.err.println("Value not found");
				return;
			}
			
			if(arr[mid]==value) {
				System.out.print("Value "+value+" found at index: "+mid);
				return;
			}
			
			else if(value<arr[mid]) {
				binarySearchUsingRecursion(arr,54,beg,mid-1);	
			}
			else {
				binarySearchUsingRecursion(arr,54,mid+1,end);	
			}

	}		

	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		int[] arr = new int[] {1,28,46,54,88,140};
		//obj.binarySearchUsingIteration(arr,54);
		obj.binarySearchUsingRecursion(arr,5,0,5);
	}

}
