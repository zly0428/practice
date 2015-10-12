package vendingmachine;

import java.util.Scanner;

public class VendingMachine {

	int price;
	int balance;
	int total;
	
	void setPrice( int price )
	{
		this.price = price;
	}
	
	void showPrompt()
	{
		System.out.println("价格是"+price+"元");
	}
	
	void showBalance()
	{
		System.out.println("你以投入"+balance+"元");
	}
	
	void insertMoney(int amount)
	{
		balance=balance+amount;
		showBalance();
	}
	void getFood()
	{
		if (balance>price)
		{
			total=balance-price;
			System.out.println("给你！吃货！");
			System.out.println("找零："+total+"元");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm =new VendingMachine();
		vm.setPrice(70);
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
	}

}
