package java_20170912_obj;
import java.util.Scanner;
public class Person {
	//����: ��
	Scanner scan = new Scanner(System.in);
	int money = 1500;
	
	int insertMoney(){
		System.out.print("��(������ �ִ´�): ");
		int inserted = scan.nextInt();
		System.out.println("���� ������ �ִ� "+money+"������ "+inserted+"���� ���� ���Ǳ⿡ �����ߴ�.");
		money = money - inserted;
		System.out.println("���� �������� ���� "+money+"���� ���Ҵ�.");
		return inserted;
	}
	
	String choose(){
		System.out.print("��(�޴��� �����Ѵ�): ");
		String menu = scan.next();
		return menu;
	}
	void takeChange(int change){
		System.out.println("\r���� �ܵ� "+change+"���� ȸ���Ͽ���.");
		System.out.println("���� ������ "+(money+change)+"���� ���Ҵ�.");
	}

}
