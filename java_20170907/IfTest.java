/**
 * ����: ���ǹ�(�б⹮) �ܼ� if �ǽ�
 */

package java_20170907;
import java.util.Scanner;
public class IfTest {

	public static void main(String[] args) {
		//score ������ üũ�Ͽ� �հݰ�� ���
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻʽÿ�: ");
		int score = scan.nextInt();
		System.out.print("�ش� ������ ����� ");
		String result;
		if(score >= 90){
			result = "A";
			//System.out.print("A");
		}else if(score<90&&score>=80){
			result = "B";
			//System.out.print("B");
		}else if(score<80&&score>=70){
			result = "C";
			//System.out.print("C");
		}else if(score<70&&score>=60){
			result = "D";
			//System.out.print("D");
		}else{
			result = "FAIL";
			//System.out.print("FAIL");
		}
		System.out.println(result + "�Դϴ�.");
		scan.close();

		
	}

}
