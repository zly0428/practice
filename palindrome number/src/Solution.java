

public class Solution {
	
	public static void main(String args[]) {
		
		System.out.println(isPalindrome(12354321));
	}
	public static boolean isPalindrome(int x) {
		if (x<0)
		{
			return false;
		}
		else
		{
//			int t=0;
//			int shang=x;
//			while (shang !=0)
//			{
//				
//				t=(t+(shang%10))*10;
//				shang=shang/10;
//			}
//			t=t/10;
//			if (x ==t)
//			{
//				return true;
//			}
//			else{
//				return false;
//			}
			boolean re=true;  
	        int div=1;  
	        while(x/div>=10){  
	            div*=10;  
	        }  
	        while(x>0){  
	            int h=x/div;//head  
	            int t=x%10;//tail  
	            if(h!=t){  
	                re=false;  
	                break;  
	            }  
	            x=(x%div)/10;//now x is 232 instead of 12321  
	            div/=100;//accordingly, div should be 100 instead of 10000  
	        }  
	        return re;  
		}
		
	}

}

