package Solutions;



import java.util.*;

public class Sum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        long[] array = new long[total]; 
        long sum = 0;
        for (int i = 0;i<total;i++) {
                array[i]=in.nextInt();
                sum += array[i];
        }
        in.close();
        System.out.print(sum);
        
    }
}