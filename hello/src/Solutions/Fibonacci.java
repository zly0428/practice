package Solutions;
/*
public class Fibonacci {
	
	
    public int fibonacci(int n) {
        // write your code here
    	if (n == 1 || n ==2) {
    		return 1;
        }
    	else
    		return fibonacci(n-1)+fibonacci(n-2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		f.fibonacci(8);
		System.out.println(f.fibonacci(8));
	}

}
*/
class Fibonacci {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        
        else {
       
        int [] a = new int[n];
        a[0] = 0;
        a[1] = 1;

        
            for (int i = 2;i <n;i++) {
                a[i] = a[i-1]+a[i-2];
            }
            return a[n-1];
        }
    }

	public static void main(String[] args) {
		Fibonacci s = new Fibonacci();
		System.out.println(s.fibonacci(10));
	}
}