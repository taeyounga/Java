package java_20170919;

public class President extends GPerson implements GInterface{
	//FIELD
	String nation;
	
	//CONSTRUCTOR
	public President() {
		System.out.println("President�� �⺻������");
	}
	
	//METHOD
	public void sleep() {
		System.out.println("������� ���� �ܴ�");
	}
	public void eat() {
		System.out.println("������� ���� �Դ´�");
	}
}
