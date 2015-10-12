package lintcode;



public class BinarySearch {
	
	public int binarySearch(int[] nums, int target) {
		int size = nums.length-1;
		while (true) {
			int low = 0;
			int high = size;
			if ( target >= nums[low+(high-low)/2]) {
				low = (low+high)/2;
			}
			else 
				high = (low+high)/2;
			
			if ( high < low ) {
				return -1;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch a = new BinarySearch();
		int[] nums = {1,2,3,3,4,5,10};
		a.binarySearch(nums, 3);
	}

}
