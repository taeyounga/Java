package java_20170911_vending_answer;
public class ServiceArea {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Customer john = new Customer();
		
		cm.showMenu();
		cm.moneyCheck(john.money);
		cm.makeCoffee(john.menu);
		
		

	}

}
