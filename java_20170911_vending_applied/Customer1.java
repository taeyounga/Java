package java_20170911_vending_applied;
import java.util.Scanner;
public class Customer1 {
	Scanner scan = new Scanner(System.in);
	int budget = 700;
	int change = 0;
	
	//동전을 넣는다
	int insertMoney(){
		System.out.println("고객의 주머니에는 "+budget+"원이 있다.");
		System.out.print("고객(동전을 넣는다): ");
		int insert = scan.nextInt();
		budget = budget - insert;
		System.out.println("자판기에 "+insert+"원을 넣으니 주머니에"+budget+"원이 남았다.");
		return insert;
	}
	
	//메뉴를 선택한다
	String choiceMenu(){
		System.out.print("고객(메뉴를 선택한다): ");
		String menu = scan.next();
		return menu;
	}
	
	void takeChange(){
		
	}

}
