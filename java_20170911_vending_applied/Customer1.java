package java_20170911_vending_applied;
import java.util.Scanner;
public class Customer1 {
	Scanner scan = new Scanner(System.in);
	int budget = 700;
	int change = 0;
	
	//������ �ִ´�
	int insertMoney(){
		System.out.println("���� �ָӴϿ��� "+budget+"���� �ִ�.");
		System.out.print("��(������ �ִ´�): ");
		int insert = scan.nextInt();
		budget = budget - insert;
		System.out.println("���Ǳ⿡ "+insert+"���� ������ �ָӴϿ�"+budget+"���� ���Ҵ�.");
		return insert;
	}
	
	//�޴��� �����Ѵ�
	String choiceMenu(){
		System.out.print("��(�޴��� �����Ѵ�): ");
		String menu = scan.next();
		return menu;
	}
	
	void takeChange(){
		
	}

}
