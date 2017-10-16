package java_20170921_MemberUI;
import java.util.*;
public class Member {
	//FIELD
	static private Vector<MemberVO> list = new Vector<MemberVO>();
	public static Vector<MemberVO> getList(){
		return list;
	}
	
	public static void setList(Vector<MemberVO> list){
		Member.list = list;
	}
	
}
