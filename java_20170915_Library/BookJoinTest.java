package java_20170915_Library;
import java.util.*;
public class BookJoinTest {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		BookJoin join = new BookJoin();
		String title, author, publisher;
		int price;
		boolean flag = true;
		System.out.println("회원등록 프로그램을 실행합니다.");
		while(flag){
			System.out.print("회원을 등록하시겠습니까?(y/n): ");
			if(scan.next().equals("y")){
				System.out.print("제목: ");
				title = scan.next();
				System.out.print("저자: ");
				author = scan.next();
				System.out.print("출판사: ");
				publisher = scan.next();
				System.out.print("가격: ");
				price = scan.nextInt();
				BookVO vo = new BookVO(title, author, publisher, price);
				join.addBook(vo);
			}else{
				flag = false;
			}
		}
		scan.close();
		join.showList();
	}
}
