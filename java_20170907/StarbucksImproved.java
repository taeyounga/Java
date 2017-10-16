package java_20170907;
import java.util.Scanner;
public class StarbucksImproved {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**별다방에 오신 것을 환영합니다**\r\r"
				+ "---------메뉴판---------\r"
				+ "1.아메리카노\t5,000원\r"
				+ "2.라떼\t\t6,000원\r"
				+ "3.아이스아메리카노\t5,500원\r"
				+ "4.아이스라떼\t6,500원\r"
				+ "5.티라미수\t\t4,500원\r"
				+ "6.스콘\t\t2,000원\r");
		
		boolean flag=true;
		int americano = 0, latte = 0, iamericano = 0, ilatte = 0, tiramisu = 0, scone = 0;
		int bill = 0, ordercount = 0;
		while(flag){
			System.out.print("무엇을 주문하시겠습니까?: ");
			int menu = scan.nextInt();
			String add;
			switch(menu){
			case 1:
				System.out.print("아메리카노를 선택하셨습니다. 수량을 선택하십시오: ");
				ordercount = scan.nextInt();
				americano = americano + ordercount;
				System.out.print("더 주문하시겠습니까?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 2:
				System.out.print("라떼를 선택하셨습니다. 수량을 선택하십시오: ");
				ordercount = scan.nextInt();
				latte = latte + ordercount;
				System.out.print("더 주문하시겠습니까?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 3:
				System.out.print("아이스아메리카노를 선택하셨습니다. 수량을 선택하십시오: ");
				ordercount = scan.nextInt();
				iamericano = iamericano + ordercount;
				System.out.print("더 주문하시겠습니까?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 4:
				System.out.print("아이스라떼를 선택하셨습니다. 수량을 선택하십시오: ");
				ordercount = scan.nextInt();
				ilatte = ilatte + ordercount;
				System.out.print("더 주문하시겠습니까?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 5:
				System.out.print("티라미수를 선택하셨습니다. 수량을 선택하십시오: ");
				ordercount = scan.nextInt();
				tiramisu = tiramisu + ordercount;
				System.out.print("더 주문하시겠습니까?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 6:
				System.out.print("스콘을 선택하셨습니다. 수량을 선택하십시오: ");
				ordercount = scan.nextInt();
				scone = scone + ordercount;
				System.out.print("더 주문하시겠습니까?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			default:
				System.out.println("없는 메뉴입니다. 아메리카노, 라떼 중에서 선택하여주십시오.");
			}
		}
		bill = americano*5000 + latte * 6000 + iamericano*5500 + ilatte*6500 + tiramisu*4500 + scone*2000;
		System.out.println("---------주문내역--------");
		if(americano!=0){
			System.out.println("아메리카노\t\t"+americano+"잔");
		}else{}
		if(latte!=0){
			System.out.println("라떼\t\t"+latte+"잔");
		}else{}
		if(iamericano!=0){
			System.out.println("아이스아메리카노\t\t"+iamericano+"잔");
		}else{}
		if(ilatte!=0){
			System.out.println("아이스라떼\t\t"+ilatte+"잔");
		}else{}
		if(tiramisu!=0){
			System.out.println("티라미수\t\t"+tiramisu+"개");
		}else{}
		if(scone!=0){
			System.out.println("스콘\t\t"+scone+"개");
		}else{}
	
		System.out.println("결제하실 금액은 "+bill+"원 입니다.");

	scan.close();
	}


}
