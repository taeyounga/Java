package java_20170912;
import java.util.Scanner;
public class Stru_ServiceArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//메뉴출력
		System.out.println("**************");
		System.out.println("커피:\t 300원");
		System.out.println("카푸치노:\t 500원");
		System.out.println("카페라떼:\t 600원");
		System.out.println("**************");
		
		//돈 투입
		System.out.print("고객(동전을 넣는다): ");
		int money = scan.nextInt();
		
		//투입금액 확인
		System.out.println("투입된 금액은 "+money+"원 입니다.");
		
		if(money<300){
			System.out.println("금액이 부족합니다");
		}else if(money>300 && money<500){
			System.out.println("자판기: 커피 주문이 가능합니다");
		}else if(money>=500 && money<600){
			System.out.println("자판기: 커피, 카푸치노 주문이 가능합니다");
		}else if(money>=600){
			System.out.println("자판기: 커피, 카푸치노, 카페라떼 주문이 가능합니다");
		}
		
		System.out.print("고객(메뉴를 선택하세요): ");
		String menu = scan.next();
		
		int change = 0;
		
		if(menu.equals("커피")){
			if(money>300) change = money - 300;
		}else if(menu.equals("카푸치노")){
			if (money>500) change = money - 500;
		}else if(menu.equals("카페라떼")){
			if (money>600) change = money - 600;
		}
		
		System.out.println("자판기: 거스름돈은 "+change+"원 입니다.");
		System.out.println("자판기: 주문하신 "+menu+"가 완성되었습니다.");
		System.out.println("자판기: 맛있게 드세요!");
		
		scan.close();

	
	}

}
