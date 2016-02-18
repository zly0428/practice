package binarytree;

public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        //write your code here
        int lo = 0;
		int hi = nums.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (target < nums[mid]) {
				hi = mid - 1;
			}
			else if (target > nums[mid]) {
				lo = mid + 1;
			}
			else  {
				return mid;
			}
		}
		return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch b = new BinarySearch();
		int [] nums = {1,4,4,5,7,7,8,9,9,10};
		System.out.println(b.binarySearch(nums,6));
	}

}
