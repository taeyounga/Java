package java_20170911_project;
import java.util.Scanner;
public class StarBucks {

	public static void main(String[] args) {
		
		System.out.println("**���ٹ濡 ���� ���� ȯ���մϴ�**\r\r"
				+ "---------�޴���---------\r"
				+ "1.�Ƹ޸�ī��\t5,000��\r"
				+ "2.��\t\t6,000��\r"
				+ "----------------------");		
		
		
		Scanner scan = new Scanner(System.in);
		Staff partner = new Staff();
		Customer song = new Customer();
		
		System.out.println("����: �޴��� �������ּ���.");
		System.out.print("��: ");
		String menu = song.order(scan.next());
		System.out.println("��: "+menu+"�� �ֹ��մϴ�.");
		String orderResult = partner.menuCheck(menu);
		System.out.println("����: ���Բ��� �ֹ��Ͻ� "+menu+"�� "+orderResult);
		
		System.out.println("����: �����ݾ���"+partner.uprice+"�� �Դϴ�.");
		String priceResult = partner.priceCheck(song.money);
		System.out.println("����: ����ݾ��� "+ priceResult);
		song.money = song.money - partner.uprice;
		System.out.println("����: �ܾ��� "+song.money+"�� �Դϴ�.");
		

		scan.close();
		

	}

}
