//VO�� ���� �ְ�, ������ ���� ����ϴ� ��ü.
package java_20170915_Search;
public class MemberSearch {
	//FIELD
	//CONSTRUCTOR
	//METHOD
	//ȸ�� �˻� ���
	public void search(String keyword){
		boolean result = true;
		//ȸ������Ʈ ��������
		java.util.Vector<MemberVO> list = Member.getList();
		//�˻�
		System.out.println("'"+keyword+"'" + " Ű���尡 ���Ե� ����Դϴ�.");
		for(int i=0; i<list.size();i++){
			//ȸ������ ���ԵǾ� �ִ°�?
			if(list.get(i).getName().contains(keyword) || list.get(i).getNational().contains(keyword)){
				System.out.println((i+1)+"\t"+list.get(i).getName()+"\t"+list.get(i).getHeight()+"\t"+list.get(i).getWeight()+"\t"+list.get(i).getNational());
			}else{
				result=false;
			}
		}
		if(result==false){
			System.out.println("�˻������ �����ϴ�.");
		}
	}
	public void search(int keyword){
		boolean result = true;
		//ȸ������Ʈ ��������
		java.util.Vector<MemberVO> list = Member.getList();
		//�˻�
		System.out.println("'"+keyword+"'" + " Ű���尡 ���Ե� ����Դϴ�.");
		for(int i=0; i<list.size();i++){
			//ȸ������ ���ԵǾ� �ִ°�?
			if(list.get(i).getHeight() == keyword || list.get(i).getWeight() == keyword){
				System.out.println((i+1)+"\t"+list.get(i).getName()+"\t"+list.get(i).getHeight()+"\t"+list.get(i).getWeight()+"\t"+list.get(i).getNational());
			}else{
				result = false;
			}
		}
		if(result==false){
			System.out.println("�˻������ �����ϴ�.");
		}
	}
}