package java_20170906;
import java.util.Scanner;
public class StarbucksOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ٹ濡 ���� ���� ȯ���մϴ�\r"
				+ "********�޴���*********\r"
				+ "  �Ƹ޸�ī��\t4000��\r"
				+ "  ��\t\t5000��");
		int price;
		String repeat;
		//While flag start here
		boolean flag = true;
		while(flag){
		
			System.out.print("�޴��� �����ϼ��� > ");
			String menu = scan.next();
			if(menu.equals("�Ƹ޸�ī��")){
				price = 4000;
			}else if(menu.equals("��")){
				price = 5000;
			}else{
				System.out.println("�Ǹ����� �ʴ� �޴��Դϴ�");
				price = 0;
			}
			System.out.print("������ �����ϼ��� > ");
			int quantity = scan.nextInt();
			//�� �ֹ��Ͻðڽ��ϱ�? YES? NO?
			System.out.print("�� �ֹ��Ͻðڽ��ϱ�?(y/n): ");
			repeat = scan.next();
			if(repeat.equals("y")){
				flag=true;
			}else{
				System.out.println("***���ٹ� �ֹ������Դϴ�***");
				System.out.println("�����Ͻ� �޴��� " + menu + " �Դϴ�.");
				System.out.println("�����Ͻ� ������ " + quantity + "�� �Դϴ�.");
				System.out.println("�����Ͻ� �ݾ��� " + price*quantity + "�� �Դϴ�.");
				flag=false;
			}
		}
		
		
		
		scan.close();
		
		

	}

}
