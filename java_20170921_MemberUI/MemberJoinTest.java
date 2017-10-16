package java_20170921_MemberUI;
import java.util.*;
public class MemberJoinTest {

	public static void main(String[] args) {
		//MemberVO객체 생성 후 이름, 신장, 몸무게, 국가 입력하고 MemberVO를 통째로 넘겨서 list에 저장한다.
		Scanner scan = new Scanner(System.in);
		String name, national;
		int height, weight;
		boolean flag = true;
		MemberJoin join = new MemberJoin();
		MemberSearch search = new MemberSearch();
		
		MemberUI ui = new MemberUI();
		
		while(flag){
			System.out.print("회원등록을 진행하시겠습니까?(y/n)> ");
			if(scan.next().equals("y")){
				System.out.print("이름: ");
				name = scan.next();
				System.out.print("신장: ");
				height = scan.nextInt();
				System.out.print("몸무게: ");
				weight = scan.nextInt();
				System.out.print("국가: ");
				national = scan.next();
				MemberVO vo = new MemberVO(name, height, weight, national);
				join.addMember(vo);
			}else{
				flag=false;
			}
		}
		join.showList();
		
		System.out.print("\r\r무엇을 검색하시겠습니까?(1.이름  2.신장  3.몸무게  4.국가): ");
		int searchCategory = scan.nextInt();
		if(searchCategory==1 || searchCategory==4){
			System.out.print("검색할 키워드를 입력하십시오(String): ");
			search.search(scan.next());
		}else if(searchCategory==2 || searchCategory==3){
			System.out.print("검색할 키워드를 입력하십시오(int): ");
			search.search(scan.nextInt());
		}
		
		
		
		scan.close();
	}

}
