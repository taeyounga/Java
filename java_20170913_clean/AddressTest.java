package java_20170913_clean;
import java.util.*;
public class AddressTest {
	public static void main(String[] args) {
		Vector<AddressVO> list = new Vector<AddressVO>();
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			AddressVO vo = new AddressVO(); //개체생성
			System.out.print("이름을 입력하십시오: ");
			vo.setName(scan.next());
			System.out.print("주소를 입력하십시오: ");
			vo.setAddr(scan.next());
			System.out.print("연락처를 입력하십시오: ");
			vo.setTel(scan.next());
			list.add(vo);
			
			System.out.print("더 입력하시겠습니까?(y/n): ");
			String addMore = scan.next();
			if(addMore.equals("y")){
			}else flag = false;
		}
		scan.close();
		System.out.println("+++++주소값 출력+++++");
		System.out.println("이름\t주소\t연락처");
		for(int i=0;i<list.size();i++){
			AddressVO v = (AddressVO)list.get(i);
			System.out.println(v.getName()+"\t"+v.getAddr()+"\t"+v.getTel());
		}

	}

}
