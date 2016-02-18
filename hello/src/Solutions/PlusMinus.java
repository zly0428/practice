package Solutions;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] array = new int[num];
		int positiveNum = 0;
		int negetiveNum = 0;
		int zeroNum = 0;
		for (int i = 0; i < num; i++) {
			array[i] = in.nextInt();
			if ( array[i] > 0) 
				positiveNum++;
			else if ( array[i] < 0) 
				negetiveNum++;
			else 
				zeroNum++;
		}
		in.close();
		System.out.println((float)positiveNum/num);
		System.out.println((float)negetiveNum/num);
		System.out.println((float)zeroNum/num);
	}

}
