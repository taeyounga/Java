package java_20170921_MemberUI;
public class MemberJoin {
	//FIELD
	MemberVO vo = null; //개체생성
	//Vector<MemberVO> list = new Vector<MemberVO>(); <- 이걸 Member.java의 Static으로 올림. 이제 list는 Member.list로 refer.
	//CONSTRUCTOR
	//METHOD
	public MemberVO getMemberVO(){
		return vo;
	}
	public void setMemberVO(MemberVO vo){
		this.vo = vo;
	}
	//리스트에 회원등록
	public void addMember(){
		Member.getList().add(vo);
	}
	public void addMember(MemberVO vo){     //메소드 오버로딩. 인자가 없으면 위 처럼, 인자가 있으면 이걸로.
		Member.getList().add(vo);
	}
	public void showList(){
		System.out.println("**********회원 정보***********");
		System.out.println("번호\t이름\t신장\t몸무게\t국가");
		System.out.println("---------------------------");
		for(int i=0;i<Member.getList().size();i++){
			vo = Member.getList().get(i);
			System.out.print((i+1)+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getHeight()+"\t");
			System.out.print(vo.getWeight()+"\t");
			System.out.println(vo.getNational()+"\t");
		}
	}
}
