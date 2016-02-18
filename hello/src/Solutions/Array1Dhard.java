package Solutions;

import java.util.Scanner;

public class Array1Dhard {
	
	public static int moveF(int p, int[] arr) {
		return p = p+1;
	}
	public static int moveFm(int p, int m,int[] arr) {
		return p = p+m;
	}
	public static int moveB(int p, int[] arr) {
		return p = p-1;
	}
	public static boolean isMoveF(int p, int[] arr) {
		if ( arr[p+1] == 0)
			return true;
		else
			return false;
	}
	public static boolean isMoveB(int p, int[] arr) {
		if ( arr[p-1] == 0)
			return true;
		else
			return false;
	}
	public static  boolean isMoveFm(int p, int m, int[] arr) {
		if ( arr[p+m] == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testNum = in.nextInt();

        int[] array;
        for (int i = 0; i < testNum; i++) {
                int n = in.nextInt(); // size of array;
                int m = in.nextInt(); // step;
                array = new int[n];
                boolean result;
                int pointer = 0;
                int step = 0;
        // set the array;
            for (int j = 0; j < n; j++) {
                array[j] = in.nextInt();         
        }
            while ( true) {
            	while ( isMoveF(pointer, array) ) {
            		pointer = moveF(pointer, array);
            	}

            }

    }
        

}
}
