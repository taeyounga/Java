package java_20170911_vending;
import java.util.Scanner;
public class Machine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Customer hyo = new Customer();		
				
		System.out.println("----���Ǳ� �޴�----\r"
				+ "īǪġ��\t1000��\r"
				+ "---------------");
		int cappucino = 1000;
		int price ;
		int change;
		//����Ȯ��
		System.out.println("hyo�� �������� "+hyo.money+"���� �ֽ��ϴ�.\r");
		//�ݾ�����
		System.out.print("�ݾ��� �󸶳� �����Ͻðڽ��ϱ�?: ");
		int inputmoney;
		inputmoney = hyo.input(scan.nextInt());
		//�ݾ�üũ, ��ưȰ��ȭ
		System.out.println("�����Ͻ� �ݾ��� "+inputmoney+"�� �Դϴ�.\r");
		System.out.println("hyo�� ���� �ܾ���" + hyo.money + "�� �Դϴ�.\r");
		if(inputmoney<1000){
			System.out.println("�ֹ� �����Ͻ� ����� �����ϴ�\r");
		}else if(inputmoney >= 1000){
			System.out.println("-�ֹ� �����Ͻ� ����-\r"
					+ "īǪġ��\r"
					+ "--------------");
			//��ưȰ��ȭ, ����
			System.out.print("���Ͻô� ���Ḧ �Է��Ͻʽÿ�: ");
			String select = scan.next();
			
			//������
			if(select.equals("īǪġ��")){
				System.out.println("īǪġ�븦 �����ϼ̽��ϴ�.\r");
				price = cappucino;
			}else{
				System.out.println("���� �޴��� �����ϼ̽��ϴ�.");
				price = 0;
				}
			change = inputmoney - price;
			System.out.println("�Ž������� "+change+"�� �Դϴ�.");
			hyo.money = hyo.money+change;
			System.out.println("hyo�� �ܾ���"+hyo.money+"�Դϴ�.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
