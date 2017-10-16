package java_20170914_Starbucks_Object_Answer;
import java.util.Scanner;
public class CoffeeShopGuest {
	//Field
	Scanner scan = new Scanner(System.in);
	
	//Constructor
	//Method
	public String order(){
		System.out.print("고객(주문여부선택): ");
		return scan.next();
	}
	
	public int menuChoice(){
		System.out.print("고객(메뉴번호선택): ");
		return scan.nextInt();
	}
	
	public int payment(){
		System.out.print("고객(지불금액 선택): ");
		return scan.nextInt();
	}
}
