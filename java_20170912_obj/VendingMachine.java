package java_20170912_obj;
import java.util.Scanner;
public class VendingMachine {
	Scanner scan = new Scanner(System.in);
	int localMoney = 0;
	int change = 0;
	String addMoney;
	boolean mflag = true, dflag = true;
	//메뉴표시
	void showMenu(){
		System.out.println("**********************");
		System.out.println("오렌지주스:\t1000원");
		System.out.println("사이다:\t900원");
		System.out.println("콜라:\t900원");
		System.out.println("환타:\t700원");
		System.out.println("**********************");
	}
	//투입금액 확인
	boolean checkMoney(int inserted){
		localMoney = localMoney + inserted;
		System.out.println("투입된 금액은 "+localMoney+"원 입니다.");
		if(localMoney<700){
			System.out.println("자판기: 금액이 부족합니다");
			mflag = false;
		}else if(localMoney<=899){
			System.out.println("자판기: 환타 선택이 가능합니다.");
			mflag = true;
		}else if(localMoney<=999){
			System.out.println("자판기: 환타, 콜라, 사이다 선택이 가능합니다.");
			mflag = true;
		}else if(localMoney>=1000){
			System.out.println("자판기: 환타, 콜라, 사이다, 오렌지주스 선택이 가능합니다.");
			mflag = true;
		}
		return mflag;
	}
	
	//잔돈확인
	void checkChange(String menu){
		if(menu.equals("환타")) change = localMoney - 700;
		if(menu.equals("콜라")||menu.equals("사이다")) change = localMoney - 900;
		if(menu.equals("오렌지주스")) change = localMoney - 1000;
	}
	
	
	//음료 out
	boolean getDrink(String menu){
		checkChange(menu);
		if(change<0){
			System.out.println("자판기: 투입하신 금액으로는 해당 음료를 구입하실 수 없습니다.");
			System.out.print("자판기: 해당 음료를 구입하시기 위해 돈을 더 투입하시겠습니까?(예/아니오): ");
			addMoney = scan.next();
			if(addMoney.equals("예")){
				System.out.println("자판기: 돈을 추가로 투입해주십시오.");
				dflag = false;
			}else {
				System.out.println("자판기: 안녕히 가십시오.");
				change = localMoney;
				dflag = true;
			}
		}else{
			dflag = true;
			System.out.println("자판기: 선택한 음료는: "+menu+"입니다.");
			System.out.println("자판기: 거스름돈은 "+change+"원 입니다.");
			System.out.println("자판기: 맛있게 드세요!");
		}
		return dflag;
	}	
	
	int giveChange(){
		return change;
	}

}
