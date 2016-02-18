/*
import javax.security.auth.x500.X500Principal;

public class Solution {
	public static int reverse(int x) {
		int rev = 0;
		if (x<-2147483647 || x>2147483647) {
			return 0;
		}
		while ( x%10 !=0 || x/10 !=0) {
			
			if (Math.abs(rev)==2147483640 && Math.abs(x)>7) {
				return 0;
			}
			if (Math.abs(x)<10) {
				return rev+x;				
			}
			if (Math.abs(rev)>214748360 || (Math.abs(rev) == 214748360 && Math.abs(x%10) >4)){
				return 0;
			}
			rev =(rev + (x%10))*10;			
			x = x/10;
		}
		return 0;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.reverse(1563847412));
	}

}
*/

import javax.security.auth.x500.X500Principal;

public class Solution {
	public static int reverse(int x) {
		int rev = 0;
		if (x<-2147483647 || x>2147483647) {
			return 0;
		}
		while ( x%10 !=0 || x/10 !=0) {

			if (rev<-214748364 || rev>214748364) {
				return 0;
			}
			rev =rev*10 + (x%10);			
			x = x/10;

		}
		return rev;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.reverse(1534236469));
	}

}