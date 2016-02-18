import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		
		for (int k = 0; k < nums.length; k++) {
			result = target - nums[k];
			if ( map.containsKey(result) ) {
				return new int[] {map.get(result)+1,k+1};
			}
			map.put(nums[k],k);
		}
		throw new IllegalArgumentException("No two sum solution");
		
		
	}
	public static void main(String[] args) {
		System.out.println(Solution.twoSum(nums=(2,3,7,11) ,9));
	}

}
