package java_20170907;
import java.util.Scanner;
public class StarbucksImproved {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**���ٹ濡 ���� ���� ȯ���մϴ�**\r\r"
				+ "---------�޴���---------\r"
				+ "1.�Ƹ޸�ī��\t5,000��\r"
				+ "2.��\t\t6,000��\r"
				+ "3.���̽��Ƹ޸�ī��\t5,500��\r"
				+ "4.���̽���\t6,500��\r"
				+ "5.Ƽ��̼�\t\t4,500��\r"
				+ "6.����\t\t2,000��\r");
		
		boolean flag=true;
		int americano = 0, latte = 0, iamericano = 0, ilatte = 0, tiramisu = 0, scone = 0;
		int bill = 0, ordercount = 0;
		while(flag){
			System.out.print("������ �ֹ��Ͻðڽ��ϱ�?: ");
			int menu = scan.nextInt();
			String add;
			switch(menu){
			case 1:
				System.out.print("�Ƹ޸�ī�븦 �����ϼ̽��ϴ�. ������ �����Ͻʽÿ�: ");
				ordercount = scan.nextInt();
				americano = americano + ordercount;
				System.out.print("�� �ֹ��Ͻðڽ��ϱ�?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 2:
				System.out.print("�󶼸� �����ϼ̽��ϴ�. ������ �����Ͻʽÿ�: ");
				ordercount = scan.nextInt();
				latte = latte + ordercount;
				System.out.print("�� �ֹ��Ͻðڽ��ϱ�?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 3:
				System.out.print("���̽��Ƹ޸�ī�븦 �����ϼ̽��ϴ�. ������ �����Ͻʽÿ�: ");
				ordercount = scan.nextInt();
				iamericano = iamericano + ordercount;
				System.out.print("�� �ֹ��Ͻðڽ��ϱ�?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 4:
				System.out.print("���̽��󶼸� �����ϼ̽��ϴ�. ������ �����Ͻʽÿ�: ");
				ordercount = scan.nextInt();
				ilatte = ilatte + ordercount;
				System.out.print("�� �ֹ��Ͻðڽ��ϱ�?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 5:
				System.out.print("Ƽ��̼��� �����ϼ̽��ϴ�. ������ �����Ͻʽÿ�: ");
				ordercount = scan.nextInt();
				tiramisu = tiramisu + ordercount;
				System.out.print("�� �ֹ��Ͻðڽ��ϱ�?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			case 6:
				System.out.print("������ �����ϼ̽��ϴ�. ������ �����Ͻʽÿ�: ");
				ordercount = scan.nextInt();
				scone = scone + ordercount;
				System.out.print("�� �ֹ��Ͻðڽ��ϱ�?(y/n): ");
				add = scan.next();
				if(add.equals("y")){
					flag=true;
				}else{
					flag=false;
				}
			break;
			
			default:
				System.out.println("���� �޴��Դϴ�. �Ƹ޸�ī��, �� �߿��� �����Ͽ��ֽʽÿ�.");
			}
		}
		bill = americano*5000 + latte * 6000 + iamericano*5500 + ilatte*6500 + tiramisu*4500 + scone*2000;
		System.out.println("---------�ֹ�����--------");
		if(americano!=0){
			System.out.println("�Ƹ޸�ī��\t\t"+americano+"��");
		}else{}
		if(latte!=0){
			System.out.println("��\t\t"+latte+"��");
		}else{}
		if(iamericano!=0){
			System.out.println("���̽��Ƹ޸�ī��\t\t"+iamericano+"��");
		}else{}
		if(ilatte!=0){
			System.out.println("���̽���\t\t"+ilatte+"��");
		}else{}
		if(tiramisu!=0){
			System.out.println("Ƽ��̼�\t\t"+tiramisu+"��");
		}else{}
		if(scone!=0){
			System.out.println("����\t\t"+scone+"��");
		}else{}
	
		System.out.println("�����Ͻ� �ݾ��� "+bill+"�� �Դϴ�.");

	scan.close();
	}


}
