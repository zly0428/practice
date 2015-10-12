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
		System.out.println("�۸���"+price+"Ԫ");
	}
	
	void showBalance()
	{
		System.out.println("����Ͷ��"+balance+"Ԫ");
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
			System.out.println("���㣡�Ի���");
			System.out.println("���㣺"+total+"Ԫ");
			
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
