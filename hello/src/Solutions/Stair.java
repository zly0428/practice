package Solutions;

import java.util.Scanner;

public class Stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sig = num;
		in.close();
		for (int i = 0; i < num; i++) {
			for (int j = sig -1; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < num - sig +1; k++) {
				System.out.print("#");
			}
			sig--;
			System.out.println();
		}
	}

}
