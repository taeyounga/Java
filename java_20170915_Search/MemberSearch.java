//VO에 값을 넣고, 꺼내는 역할 담당하는 객체.
package java_20170915_Search;
public class MemberSearch {
	//FIELD
	//CONSTRUCTOR
	//METHOD
	//회원 검색 기능
	public void search(String keyword){
		boolean result = true;
		//회원리스트 가져오기
		java.util.Vector<MemberVO> list = Member.getList();
		//검색
		System.out.println("'"+keyword+"'" + " 키워드가 포함된 결과입니다.");
		for(int i=0; i<list.size();i++){
			//회원정보 포함되어 있는가?
			if(list.get(i).getName().contains(keyword) || list.get(i).getNational().contains(keyword)){
				System.out.println((i+1)+"\t"+list.get(i).getName()+"\t"+list.get(i).getHeight()+"\t"+list.get(i).getWeight()+"\t"+list.get(i).getNational());
			}else{
				result=false;
			}
		}
		if(result==false){
			System.out.println("검색결과가 없습니다.");
		}
	}
	public void search(int keyword){
		boolean result = true;
		//회원리스트 가져오기
		java.util.Vector<MemberVO> list = Member.getList();
		//검색
		System.out.println("'"+keyword+"'" + " 키워드가 포함된 결과입니다.");
		for(int i=0; i<list.size();i++){
			//회원정보 포함되어 있는가?
			if(list.get(i).getHeight() == keyword || list.get(i).getWeight() == keyword){
				System.out.println((i+1)+"\t"+list.get(i).getName()+"\t"+list.get(i).getHeight()+"\t"+list.get(i).getWeight()+"\t"+list.get(i).getNational());
			}else{
				result = false;
			}
		}
		if(result==false){
			System.out.println("검색결과가 없습니다.");
		}
	}
}