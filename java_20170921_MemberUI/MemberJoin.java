package java_20170921_MemberUI;
public class MemberJoin {
	//FIELD
	MemberVO vo = null; //��ü����
	//Vector<MemberVO> list = new Vector<MemberVO>(); <- �̰� Member.java�� Static���� �ø�. ���� list�� Member.list�� refer.
	//CONSTRUCTOR
	//METHOD
	public MemberVO getMemberVO(){
		return vo;
	}
	public void setMemberVO(MemberVO vo){
		this.vo = vo;
	}
	//����Ʈ�� ȸ�����
	public void addMember(){
		Member.getList().add(vo);
	}
	public void addMember(MemberVO vo){     //�޼ҵ� �����ε�. ���ڰ� ������ �� ó��, ���ڰ� ������ �̰ɷ�.
		Member.getList().add(vo);
	}
	public void showList(){
		System.out.println("**********ȸ�� ����***********");
		System.out.println("��ȣ\t�̸�\t����\t������\t����");
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
