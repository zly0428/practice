package lintcode;

import java.util.ArrayList;


public class FizzBuzz {
	public ArrayList<String> Fizzbuzz(int n) {
		ArrayList<String> fz =new ArrayList<String>(n);
		for(int i=1;i<n;i++) {
			if ( i%3==0 && i%5==0 ) {
				fz.add("fizz buzz");
			}
			else if ( i%3 == 0) {
				fz.add("fizz");
			}
			else if ( i%5 == 0) {
				fz.add("buzz");
			}
			else 
				fz.add(""+i);
		}
		return fz;
          
	}
	
	public static void main(String[] args) {
		FizzBuzz first = new FizzBuzz();

		System.out.print(first.Fizzbuzz(22));
	}

}


