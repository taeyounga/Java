/**
 * ����: ����ǥ
 */

package java_20170906;

import java.util.Scanner;

public class Score1 {

	public static void main(String[] args) {
		//������Ÿ�� �������� = new ������();
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�:");
		String name = scan.next();
		System.out.print("��������:");
		int kor = scan.nextInt();
		System.out.print("��������:");
		int eng = scan.nextInt();
		System.out.print("��������:");
		int math = scan.nextInt();
		scan.close();
		
		double tot = kor+eng+math;
		int tot2 = kor+eng+math;
		double avg = (double)tot2/3;
		
		System.out.println("******����ǥ*******");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg);
		System.out.println(tot);
	}
}