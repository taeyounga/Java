package java_20170911_vending;

public class Customer {
	int money = 10000;
	int decide;
	
	int input(int decide){
		money = money - decide;
		return decide;
	}
}
