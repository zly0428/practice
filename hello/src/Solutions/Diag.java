package Solutions;

import java.util.Scanner;

public class Diag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int result = 0;
		if ( num == 1) {
			result = 0;
		}
		int[][] array = new int[num][num];
		int head = 0;
		int tail = num -1;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i<num; i++) {
			for (int j = 0; j<num;j++) {
				array[i][j]=in.nextInt();
			}
			sum1 += array[i][head];
			sum2 += array[i][tail];
			head++;
			tail--;
		}
		in.close();
		result = Math.abs(sum1-sum2);
		System.out.print(result);
	}

}
