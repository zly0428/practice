package Solutions;

import java.util.Scanner;

public class Array1D {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[num];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        for (int i = 0; i < num; i++) {
            for ( int j = i ; j< num; j++) {
               sum += array[j];
                if ( sum < 0) count++;
            }
            sum = 0;
        }
        System.out.println(count);
    }
}
