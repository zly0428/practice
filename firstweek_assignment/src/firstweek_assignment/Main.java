package firstweek_assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction
{
	int x;
	int y;
	double todouble;
	
	Fraction(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void toDouble()
	{
		todouble=(double)x/y;
	}
	Fraction plus(Fraction r)
	{
		Fraction newf=new Fraction(x,y);
		newf.x=x*r.y+y*r.x;
		newf.y=y*r.y;
		return newf;
	}
	Fraction multiply(Fraction r)
	{
		Fraction newf=new Fraction(x,y);
		newf.x=x*r.x;
		newf.y=y*r.y;
		return newf;
	}
	void print()
	{
		int m=x;
		int n=y;
		if (x%y==0)
		{
			if (x==y)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println(x/y);
			}
		}
		else
		{
			while (m%n !=0)
			{

				int temp=m%n;
				m=n;
				n=temp;
			}
			
			if (n ==1)
			{
				System.out.println(x+"/"+y);
			}
			else
			{
				System.out.println(x/n+"/"+y/n);
			}
		}
		
	}
}