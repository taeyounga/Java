package java_20170912_obj;
import java.util.Scanner;
public class Person {
	//변수: 돈
	Scanner scan = new Scanner(System.in);
	int money = 1500;
	
	int insertMoney(){
		System.out.print("고객(동전을 넣는다): ");
		int inserted = scan.nextInt();
		System.out.println("고객은 지갑에 있는 "+money+"원에서 "+inserted+"원을 꺼내 자판기에 투입했다.");
		money = money - inserted;
		System.out.println("고객의 지갑에는 이제 "+money+"원이 남았다.");
		return inserted;
	}
	
	String choose(){
		System.out.print("고객(메뉴를 선택한다): ");
		String menu = scan.next();
		return menu;
	}
	void takeChange(int change){
		System.out.println("\r고객은 잔돈 "+change+"원을 회수하였다.");
		System.out.println("고객의 지갑엔 "+(money+change)+"원이 남았다.");
	}

}
