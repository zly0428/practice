import java.util.Scanner;

public class shoupiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(5==5.0);
		double a=1.0;
		double b=0.1+0.1+0.1*8;
		System.out.println(Math.abs(a-b)<1e-6);
		System.out.println("***********");
		System.out.println("票价10元");
		System.out.println("***********");
		System.out.print("请投币：");
		int amount=in.nextInt();
		if (amount>=10)
		{
			System.out.println("找零："+(amount-10));
		}
		else 
		{
			System.out.println("穷疯了，10元都没有");
		}
	}

}
