/**
 * ����: ������ �б��ϴ� switch~case~
 */

package java_20170907;
import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) {
		int menu;
		Scanner scan = new Scanner(System.in);
		System.out.println("------�޴�------");
		System.out.println("1. ��ġ�\t5000��\r2. �����\t4500��\r3. ¥���\t\t4000��");
		System.out.print("�޴��� �� ���� �ֹ��� �� �����ϼ̽��ϱ�? y/n: ");
		String choice = scan.next();
		if(choice.equals("y")){
			System.out.print("�޴� �� ���� �ֹ��Ͻðڽ��ϱ�?: ");
			int i=1, j, kc=0, dj=0, jj=0, bill=0;
			j = scan.nextInt();
			while(i<=j){
				System.out.print("�޴� ���� - 1.��ġ�  2.�����  3.¥��� : ");
				menu = scan.nextInt();
				switch(menu){
				case 1:
					System.out.println("��ġ�");
					bill = bill+5000;
					kc = kc+1;
					break;
				case 2:
					System.out.println("�����");
					bill = bill+4500;
					dj=dj+1;
					break;
				case 3:
					System.out.println("¥���");
					bill = bill+4000;
					jj=jj+1;
					break;
				default:
					System.out.println("�޴��� �ٽ� �������ֽʽÿ�.");
					break;
				}
				i++;
			}
			System.out.println("\r�ֹ��Ͻ� �޴��� ��ġ� "+kc+"�κ�,"+"����� "+dj+"�κ�, "+jj+"�κ� �Դϴ�.");
			System.out.println("\r�����Ͻ� �ݾ���" + bill+"�� �Դϴ�.");
		}else{
			int bill = 0, kc=0, dj=0, jj=0;
			boolean flag=true;
			while(flag){
				System.out.print("�޴� ���� - 1.��ġ�  2.�����  3.¥���  [0.���] : ");
				menu = scan.nextInt();
				switch(menu){
				case 0:
					flag=false;
					System.out.println("\r�ֹ��Ͻ� �޴��� ��ġ� "+kc+"�κ�,"+"����� "+dj+"�κ�, "+jj+"�κ� �Դϴ�.");
					System.out.println("\r�����Ͻ� �ݾ���" + bill+"�� �Դϴ�.");
					break;
				case 1:
					System.out.println("��ġ�");
					bill = bill+5000;
					kc = kc+1;
					break;
				case 2:
					System.out.println("�����");
					bill = bill+4500;
					dj=dj+1;
					break;
				case 3:
					System.out.println("¥���");
					bill = bill+4000;
					jj=jj+1;
					break;
				default:
					System.out.println("�޴��� �ٽ� �������ֽʽÿ�.");
					break;
			}
		}
	}
		scan.close();
}
}