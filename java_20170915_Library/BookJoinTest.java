package java_20170915_Library;
import java.util.*;
public class BookJoinTest {
	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		BookJoin join = new BookJoin();
		String title, author, publisher;
		int price;
		boolean flag = true;
		System.out.println("ȸ����� ���α׷��� �����մϴ�.");
		while(flag){
			System.out.print("ȸ���� ����Ͻðڽ��ϱ�?(y/n): ");
			if(scan.next().equals("y")){
				System.out.print("����: ");
				title = scan.next();
				System.out.print("����: ");
				author = scan.next();
				System.out.print("���ǻ�: ");
				publisher = scan.next();
				System.out.print("����: ");
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
