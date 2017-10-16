package java_20170921_MemberUI;
import java.util.*;
public class MemberJoinTest {

	public static void main(String[] args) {
		//MemberVO��ü ���� �� �̸�, ����, ������, ���� �Է��ϰ� MemberVO�� ��°�� �Ѱܼ� list�� �����Ѵ�.
		Scanner scan = new Scanner(System.in);
		String name, national;
		int height, weight;
		boolean flag = true;
		MemberJoin join = new MemberJoin();
		MemberSearch search = new MemberSearch();
		
		MemberUI ui = new MemberUI();
		
		while(flag){
			System.out.print("ȸ������� �����Ͻðڽ��ϱ�?(y/n)> ");
			if(scan.next().equals("y")){
				System.out.print("�̸�: ");
				name = scan.next();
				System.out.print("����: ");
				height = scan.nextInt();
				System.out.print("������: ");
				weight = scan.nextInt();
				System.out.print("����: ");
				national = scan.next();
				MemberVO vo = new MemberVO(name, height, weight, national);
				join.addMember(vo);
			}else{
				flag=false;
			}
		}
		join.showList();
		
		System.out.print("\r\r������ �˻��Ͻðڽ��ϱ�?(1.�̸�  2.����  3.������  4.����): ");
		int searchCategory = scan.nextInt();
		if(searchCategory==1 || searchCategory==4){
			System.out.print("�˻��� Ű���带 �Է��Ͻʽÿ�(String): ");
			search.search(scan.next());
		}else if(searchCategory==2 || searchCategory==3){
			System.out.print("�˻��� Ű���带 �Է��Ͻʽÿ�(int): ");
			search.search(scan.nextInt());
		}
		
		
		
		scan.close();
	}

}
