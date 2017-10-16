/**
 * 제목: 값으로 분기하는 switch~case~
 */

package java_20170907;
import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) {
		int menu;
		Scanner scan = new Scanner(System.in);
		System.out.println("------메뉴------");
		System.out.println("1. 김치찌개\t5000원\r2. 된장찌개\t4500원\r3. 짜장면\t\t4000원");
		System.out.print("메뉴를 몇 가지 주문할 지 결정하셨습니까? y/n: ");
		String choice = scan.next();
		if(choice.equals("y")){
			System.out.print("메뉴 몇 가지 주문하시겠습니까?: ");
			int i=1, j, kc=0, dj=0, jj=0, bill=0;
			j = scan.nextInt();
			while(i<=j){
				System.out.print("메뉴 선택 - 1.김치찌개  2.된장찌개  3.짜장면 : ");
				menu = scan.nextInt();
				switch(menu){
				case 1:
					System.out.println("김치찌개");
					bill = bill+5000;
					kc = kc+1;
					break;
				case 2:
					System.out.println("된장찌개");
					bill = bill+4500;
					dj=dj+1;
					break;
				case 3:
					System.out.println("짜장면");
					bill = bill+4000;
					jj=jj+1;
					break;
				default:
					System.out.println("메뉴를 다시 선택해주십시오.");
					break;
				}
				i++;
			}
			System.out.println("\r주문하신 메뉴는 김치찌개 "+kc+"인분,"+"된장찌개 "+dj+"인분, "+jj+"인분 입니다.");
			System.out.println("\r정산하실 금액은" + bill+"원 입니다.");
		}else{
			int bill = 0, kc=0, dj=0, jj=0;
			boolean flag=true;
			while(flag){
				System.out.print("메뉴 선택 - 1.김치찌개  2.된장찌개  3.짜장면  [0.계산] : ");
				menu = scan.nextInt();
				switch(menu){
				case 0:
					flag=false;
					System.out.println("\r주문하신 메뉴는 김치찌개 "+kc+"인분,"+"된장찌개 "+dj+"인분, "+jj+"인분 입니다.");
					System.out.println("\r정산하실 금액은" + bill+"원 입니다.");
					break;
				case 1:
					System.out.println("김치찌개");
					bill = bill+5000;
					kc = kc+1;
					break;
				case 2:
					System.out.println("된장찌개");
					bill = bill+4500;
					dj=dj+1;
					break;
				case 3:
					System.out.println("짜장면");
					bill = bill+4000;
					jj=jj+1;
					break;
				default:
					System.out.println("메뉴를 다시 선택해주십시오.");
					break;
			}
		}
	}
		scan.close();
}
}