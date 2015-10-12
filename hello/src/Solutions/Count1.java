package Solutions;

import org.omg.CORBA.portable.ValueBase;

public class Count1 {
	public int count = 0;
	public int value = 0;
	public int countOne(int number) {
		
		if (number < 2) 
		{
			if (number == 1)
				count++;
			else
				return 0;
		}
		
		value = number % 2;
		if (number != 1 && value == 1) {
			count++;
		}
		
		number /= 2;
		countOne(number);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count1 c = new Count1();
		System.out.println(c.countOne(1023));
	}

}
