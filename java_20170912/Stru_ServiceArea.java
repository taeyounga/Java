package java_20170912;
import java.util.Scanner;
public class Stru_ServiceArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//�޴����
		System.out.println("**************");
		System.out.println("Ŀ��:\t 300��");
		System.out.println("īǪġ��:\t 500��");
		System.out.println("ī���:\t 600��");
		System.out.println("**************");
		
		//�� ����
		System.out.print("��(������ �ִ´�): ");
		int money = scan.nextInt();
		
		//���Աݾ� Ȯ��
		System.out.println("���Ե� �ݾ��� "+money+"�� �Դϴ�.");
		
		if(money<300){
			System.out.println("�ݾ��� �����մϴ�");
		}else if(money>300 && money<500){
			System.out.println("���Ǳ�: Ŀ�� �ֹ��� �����մϴ�");
		}else if(money>=500 && money<600){
			System.out.println("���Ǳ�: Ŀ��, īǪġ�� �ֹ��� �����մϴ�");
		}else if(money>=600){
			System.out.println("���Ǳ�: Ŀ��, īǪġ��, ī��� �ֹ��� �����մϴ�");
		}
		
		System.out.print("��(�޴��� �����ϼ���): ");
		String menu = scan.next();
		
		int change = 0;
		
		if(menu.equals("Ŀ��")){
			if(money>300) change = money - 300;
		}else if(menu.equals("īǪġ��")){
			if (money>500) change = money - 500;
		}else if(menu.equals("ī���")){
			if (money>600) change = money - 600;
		}
		
		System.out.println("���Ǳ�: �Ž������� "+change+"�� �Դϴ�.");
		System.out.println("���Ǳ�: �ֹ��Ͻ� "+menu+"�� �ϼ��Ǿ����ϴ�.");
		System.out.println("���Ǳ�: ���ְ� �弼��!");
		
		scan.close();

	
	}

}
