package java_20170911_vending_applied;
public class ServiceArea1 {

	public static void main(String[] args) {
		CoffeeMachine1 cm = new CoffeeMachine1();
		Customer1 john = new Customer1();
		
		cm.showMenu();
		cm.moneyCheck(john.insertMoney());
		cm.makeCoffee(john.choiceMenu());
		
		

	}

}
