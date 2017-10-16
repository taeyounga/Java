package java_20170919;

public class President extends GPerson implements GInterface{
	//FIELD
	String nation;
	
	//CONSTRUCTOR
	public President() {
		System.out.println("President의 기본생성자");
	}
	
	//METHOD
	public void sleep() {
		System.out.println("대통령이 잠을 잔다");
	}
	public void eat() {
		System.out.println("대통령이 밥을 먹는다");
	}
}
