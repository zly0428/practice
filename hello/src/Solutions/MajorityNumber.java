package Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class MajorityNumber {
	
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
    	int count = 1;
    	int index = 0;
    	for (int i = index+1; i<nums.size()-1; i++) {
    		if (nums.get(index) == nums.get(i)) {
    			count++;
    		}
    		else 
    			count--;
    		if (count == 0) {
    			index = i +1;
    			count = 1;
    		}
    	}
    	return nums.get(index);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityNumber m = new MajorityNumber();
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,1,1,2,2,2,2));
		System.out.println(m.majorityNumber(a));
	}

}
