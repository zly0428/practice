package Solutions;

import java.util.ArrayList;

public class ContinousSubarraySum {

    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<>();

        int temp = A[0];
        for (int i = 0; i<A.length;i++) {
            int val = A[i];
            for (int j = i + 1; j<A.length; j++) {
                val += A[j];
                if (temp < val) {
                    result.clear();
                    result.add(i);
                    result.add(j);
                    
                }
                else { continue;}
                temp = val;
            }
            
        }
        return result;
        
    }
    
    public static void main(String[] args) {
    	ContinousSubarraySum a = new ContinousSubarraySum();
    	int[] array = {-3,1,3,-3,4};
    	System.out.println(a.continuousSubarraySum(array));
    }
}
