package Solutions;
import java.util.Arrays; 
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FizzBuzz {
	/*
	public ArrayList<String> fizzbuzz(int n) {
		ArrayList<String> fz = new ArrayList<String>();
		for (int i = 1; i < n+1; i++) {
		if ( i%3==0 && i%5==0) {
				fz.add("fizzbuzz");
			}
			else if (i%3 == 0) 
				fz.add("fizz");
			else if (i%5 == 0)
				fz.add("buzz");
			else {
				fz.add(i+"");
			}

			
			}
		return fz;
	}
	*/
	public static String fizzbuzz(int n) {
		if (n == 0) return "";
		else if (n%15 == 0) return fizzbuzz(n-1)+"fizzbuzz\n";
		else if (n%3 == 0) return fizzbuzz(n-1)+"fizz\n";
		else if (n%5 == 0) return fizzbuzz(n-1)+"buzz\n";
		return fizzbuzz(n-1)+n+"\n";
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz a = new FizzBuzz();
		System.out.print(a.fizzbuzz(15));
		
	}

}

/*
import java.util.Arrays;

public class FizzBuzz {
	
	@Override
	public String toString() {
		return "FizzBuzz []";
	}
	public String[] fizzbuzz(int n) {
		String[]  fz = new String[n];
		for (int i = 1; i < n; i++) {
			if ( i%3==0 && i%5==0) {
				fz[i]="fizzbuzz";
			}
			else if (i%3 == 0) 
				fz[i]="fizz";
			else if (i%5 == 0)
				fz[i]="buzz";
			else {
				fz[i]=i+"";
			}
		}
		return fz;

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz a = new FizzBuzz();
		System.out.print(a.fizzbuzz(15).toString());
	}

}
*/



/*
int k = 1;
if (i%3 == 0 && i %5 ==0) k+=3;
else if (i%5 == 0) k +=2;
else if (i%3 == 0 ) k ++;
switch(k)
{
case 1:
	System.out.println(i+"");
	break;
case 2:
	System.out.println("fizz");
	break;
case 3:
	System.out.println("buzz");
	break;
case 4:
	System.out.println("fizzbuzz");
	break;

*/

