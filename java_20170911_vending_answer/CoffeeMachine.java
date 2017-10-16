package java_20170911_vending_answer;

public class CoffeeMachine {
	
	void showMenu(){
		System.out.println("***************\r"
				+ "믹스커피:\t300원\r"
				+ "카페라떼:\t600원\r"
				+ "카푸치노:\t500원\r"
				+ "***************");
	}
	
	void moneyCheck(int money){
		if(money<300){
			System.out.println("자판기: 금액이 부족합니다.");
		}else if(money < 600){
			System.out.println("자판기: 커피, 카푸치노 주문이 가능합니다.");
		}else if(money >= 600){
			System.out.println("자판기: 커피, 카푸치노, 카페라떼 주문이 가능합니다.");
		}
	}
	
	void makeCoffee(String menu){
		System.out.println("자판기: 주문하신 "+menu+"가 완성되었습니다.");
		System.out.println("자판기: 맛있게 드세요~");
	}
	
	
	
}
