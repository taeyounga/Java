package java_20170911_project;
import java.util.Scanner;
public class StarBucks {

	public static void main(String[] args) {
		
		System.out.println("**별다방에 오신 것을 환영합니다**\r\r"
				+ "---------메뉴판---------\r"
				+ "1.아메리카노\t5,000원\r"
				+ "2.라떼\t\t6,000원\r"
				+ "----------------------");		
		
		
		Scanner scan = new Scanner(System.in);
		Staff partner = new Staff();
		Customer song = new Customer();
		
		System.out.println("직원: 메뉴를 선택해주세요.");
		System.out.print("고객: ");
		String menu = song.order(scan.next());
		System.out.println("고객: "+menu+"를 주문합니다.");
		String orderResult = partner.menuCheck(menu);
		System.out.println("직원: 고객님께서 주문하신 "+menu+"는 "+orderResult);
		
		System.out.println("직원: 결제금액은"+partner.uprice+"원 입니다.");
		String priceResult = partner.priceCheck(song.money);
		System.out.println("직원: 결재금액이 "+ priceResult);
		song.money = song.money - partner.uprice;
		System.out.println("직원: 잔액은 "+song.money+"원 입니다.");
		

		scan.close();
		

	}

}
