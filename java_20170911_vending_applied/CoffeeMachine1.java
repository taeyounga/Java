package java_20170911_vending_applied;

public class CoffeeMachine1 {
	int gmoney = 0; //고객이 투입한 돈
	void showMenu(){
		System.out.println("***************\r"
				+ "커피:\t300원\r"
				+ "카페라떼:\t600원\r"
				+ "카푸치노:\t500원\r"
				+ "***************");
	}
	
	void moneyCheck(int money){
		gmoney = money;
		if(money<300){
			System.out.println("자판기: 금액이 부족합니다.");
		}else if(money < 600){
			System.out.println("자판기: 커피, 카푸치노 주문이 가능합니다.");
		}else if(money >= 600){
			System.out.println("자판기: 커피, 카푸치노, 카페라떼 주문이 가능합니다.");
		}
	}
	
	void makeCoffee(String menu){
		changeCheck(menu); //중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("자판기: 주문하신 "+menu+"가 완성되었습니다.");
		System.out.println("자판기: 맛있게 드세요~");
	}
	
	void changeCheck(String menu){
		int change = 0;
		if(menu.equals("커피")){
			if(gmoney>300){
				change = gmoney - 300;
			}
		}else if(menu.equals("카푸치노")){
			if(gmoney>300){
				change = gmoney - 500;
			}
		}else if(menu.equals("카페라떼")){
			if(gmoney>300){
				change = gmoney - 600;
			}
		}
		System.out.println("자판기: 거스름돈은 "+change+"원 입니다.");
	}
		
	
	
	
}
