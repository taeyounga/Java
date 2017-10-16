package java_20170911_vending;
import java.util.Scanner;
public class Machine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Customer hyo = new Customer();		
				
		System.out.println("----자판기 메뉴----\r"
				+ "카푸치노\t1000원\r"
				+ "---------------");
		int cappucino = 1000;
		int price ;
		int change;
		//지갑확인
		System.out.println("hyo의 지갑에는 "+hyo.money+"원이 있습니다.\r");
		//금액투입
		System.out.print("금액을 얼마나 투입하시겠습니까?: ");
		int inputmoney;
		inputmoney = hyo.input(scan.nextInt());
		//금액체크, 버튼활성화
		System.out.println("투입하신 금액은 "+inputmoney+"원 입니다.\r");
		System.out.println("hyo의 지갑 잔액은" + hyo.money + "원 입니다.\r");
		if(inputmoney<1000){
			System.out.println("주문 가능하신 음료는 없습니다\r");
		}else if(inputmoney >= 1000){
			System.out.println("-주문 가능하신 음료-\r"
					+ "카푸치노\r"
					+ "--------------");
			//버튼활성화, 선택
			System.out.print("원하시는 음료를 입력하십시오: ");
			String select = scan.next();
			
			//결과출력
			if(select.equals("카푸치노")){
				System.out.println("카푸치노를 선택하셨습니다.\r");
				price = cappucino;
			}else{
				System.out.println("없는 메뉴를 선택하셨습니다.");
				price = 0;
				}
			change = inputmoney - price;
			System.out.println("거스름돈은 "+change+"원 입니다.");
			hyo.money = hyo.money+change;
			System.out.println("hyo의 잔액은"+hyo.money+"입니다.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
