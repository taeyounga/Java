/**
 * ����: �̸��� �Է¹޾� 5������ ������ �� ��ü ���
 */

package java_20170908;
import java.util.Scanner;
public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		String[] list = new String[5];
		for(int i=0;i<list.length;i++){
			System.out.print((i+1)+"/"+list.length+" ��° �̸��� �Է��Ͻʽÿ�: ");
			String name = scan.next();
			list[i] = name;
						
		}
		scan.close();
		for(int i=0;i<list.length;i++){
			System.out.println("list["+i+"] = "+list[i]);
		}
		*/
		
		/*�̸�, ���� �Է� �� ���
		String[] namelist = new String[5];
		int[] scorelist = new int[5];
		
		for(int i=0;i<namelist.length;i++){
			System.out.print((i+1)+"/"+namelist.length+" ��° �̸��� �Է��Ͻʽÿ�: ");
			String name = scan.next();
			namelist[i] = name;
			System.out.print((i+1)+"/"+scorelist.length+" ��° ������ �Է��Ͻʽÿ�: ");
			int score = scan.nextInt();
			scorelist[i] = score;
						
		}
		scan.close();
		for(int i=0;i<namelist.length;i++){
			System.out.println("namelist["+i+"] = "+namelist[i]+"\t\t"+"scorelist["+i+"] = "+scorelist[i]);
		}
		*/
		String[] namelist = new String[5];
		int[][] scorelist = new int[5][3];
		String[] subjectlist = new String[3];
		subjectlist[0] = "����";		
		subjectlist[1] = "����";		
		subjectlist[2] = "����";		

		for(int i=0;i<namelist.length;i++){
			System.out.print((i+1)+"/"+namelist.length+" ��° �̸��� �Է��Ͻʽÿ�: ");
			String name = scan.next();
			namelist[i] = name;
			
			for(int j=0;j<scorelist[i].length;j++){
				System.out.print(namelist[i]+"�� "+subjectlist[j]+" ������ �Է��Ͻʽÿ�: ");
				int score = scan.nextInt();
				scorelist[i][j] = score;
			}
						
		}
		scan.close();
		System.out.println("�̸�\t��������\t��������\t��������");
		for(int i=0;i<namelist.length;i++){
			System.out.print(namelist[i]+"\t");
			
			for(int j=0;j<scorelist[i].length;j++){
				System.out.print(scorelist[i][j]+"\t");
			}
			System.out.println();
		}

		
		
	}

}
