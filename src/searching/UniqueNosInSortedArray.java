package searching;

import java.util.ArrayList;

// Find unique nos. in a sorted array (in less than O(n))

public class UniqueNosInSortedArray {

	private static void uniqueNosInSortedArrayUsingRecursion(int[] arr, int beg_index, int end_index, ArrayList<Integer> uniqueArr, boolean skipFirst) {
		
		int beg_value = arr[beg_index];
		int end_value = arr[end_index];

		if(arr.length == 0) {
			return;
		}
			
		if(beg_value == end_value) {
			if (!skipFirst) {
				uniqueArr.add(beg_value);
				return;
			}	
		}
		
		else {
			int mid_index= (beg_index + end_index)/2;
			int mid_value = arr[mid_index];

			uniqueNosInSortedArrayUsingRecursion(arr, beg_index, mid_index, uniqueArr, skipFirst);
			uniqueNosInSortedArrayUsingRecursion(arr, mid_index+1, end_index, uniqueArr, arr[mid_index]==arr[mid_index+1]);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> uniqueArr = new ArrayList<Integer>();
		int[] arr = {1,1,1,1,1,1,2,3,3};
		uniqueNosInSortedArrayUsingRecursion(arr, 0, arr.length-1, uniqueArr, false);
		System.out.println(uniqueArr);
	}
}
