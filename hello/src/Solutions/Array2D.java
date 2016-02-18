package Solutions;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] array = new int[6][6];
		int sum = -100;
		int total = 0;
		for (int i = 0;i<6;i++) {
			for (int j = 0; j< 6; j++) {
				array[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i< 4; i++) {
			for (int j = 0; j<4;j++) {
				total = array[i][j]+array[i][j+1]+array[i][j+2]+array[i+1][j+1]+array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
				if ( total > sum) {
					sum = total;
				}	
			}
		}
		in.close();
		System.out.print(sum);
	}

}
