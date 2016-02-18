/*
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			for (int k = 0; k < n-i-1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
*/


public class Solution {

    public boolean isUnique(String str) {
        // write your code here
    	//String string = "this is a string";
    	char[] array = str.toCharArray();
    	System.out.println(array);
    	boolean signal = true;
  //  	for (char i : array) {
  // 		System.out.println(i);
  // 	}
    	for (int i=0;i<array.length;i++) {
    		for (int k=i+1;k<array.length;k++) {
        		if (array[i] == array[k]) {
        			signal = false;
        		}
    		}

    	}
    	if (signal == true) {
    		System.out.println("true");
    	}
    	else 
    		System.out.println("false");
    	return signal;
    }
    public static void main(String[] args) {
    	Solution s = new Solution();
    	s.isUnique("abcc");

    }
}



