package java_20170913;

public class StaticObject {
	//Field
	static String sval = "static 변수";
	String val = "일반 변수";

	//Constructor

	
	//Method
	public static void sMethod(){
		System.out.println("static 메소드 호출");
	}
	
	public void gMethod(){
		System.out.println("일반 메소드 호출");
	}
	
	
	
}
