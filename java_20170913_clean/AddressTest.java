package java_20170913_clean;
import java.util.*;
public class AddressTest {
	public static void main(String[] args) {
		Vector<AddressVO> list = new Vector<AddressVO>();
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			AddressVO vo = new AddressVO(); //��ü����
			System.out.print("�̸��� �Է��Ͻʽÿ�: ");
			vo.setName(scan.next());
			System.out.print("�ּҸ� �Է��Ͻʽÿ�: ");
			vo.setAddr(scan.next());
			System.out.print("����ó�� �Է��Ͻʽÿ�: ");
			vo.setTel(scan.next());
			list.add(vo);
			
			System.out.print("�� �Է��Ͻðڽ��ϱ�?(y/n): ");
			String addMore = scan.next();
			if(addMore.equals("y")){
			}else flag = false;
		}
		scan.close();
		System.out.println("+++++�ּҰ� ���+++++");
		System.out.println("�̸�\t�ּ�\t����ó");
		for(int i=0;i<list.size();i++){
			AddressVO v = (AddressVO)list.get(i);
			System.out.println(v.getName()+"\t"+v.getAddr()+"\t"+v.getTel());
		}

	}

}
