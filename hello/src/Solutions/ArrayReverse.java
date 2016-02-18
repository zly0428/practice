package Solutions;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = in.nextInt();
		}
		for (int i = num; i > 0; i--) {
			System.out.print(array[i-1] + " ");
		}
	}

}
