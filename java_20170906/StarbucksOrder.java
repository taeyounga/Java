package java_20170906;
import java.util.Scanner;
public class StarbucksOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("별다방에 오신 것을 환영합니다\r"
				+ "********메뉴판*********\r"
				+ "  아메리카노\t4000원\r"
				+ "  라떼\t\t5000원");
		int price;
		String repeat;
		//While flag start here
		boolean flag = true;
		while(flag){
		
			System.out.print("메뉴를 선택하세요 > ");
			String menu = scan.next();
			if(menu.equals("아메리카노")){
				price = 4000;
			}else if(menu.equals("라떼")){
				price = 5000;
			}else{
				System.out.println("판매하지 않는 메뉴입니다");
				price = 0;
			}
			System.out.print("수량을 선택하세요 > ");
			int quantity = scan.nextInt();
			//더 주문하시겠습니까? YES? NO?
			System.out.print("더 주문하시겠습니까?(y/n): ");
			repeat = scan.next();
			if(repeat.equals("y")){
				flag=true;
			}else{
				System.out.println("***별다방 주문내역입니다***");
				System.out.println("선택하신 메뉴는 " + menu + " 입니다.");
				System.out.println("선택하신 수량은 " + quantity + "개 입니다.");
				System.out.println("결제하실 금액은 " + price*quantity + "원 입니다.");
				flag=false;
			}
		}
		
		
		
		scan.close();
		
		

	}

}
