package java_20170919;

public class Student extends GPerson implements GInterface{
	//FIELD
	String school;
	int grade;
	//CONSTRUCTOR
	public Student() {
		System.out.println("Student�� �⺻������");
	}
	//METHOD
	public void sleep() {
		System.out.println("�л��� �����ܴ�");
	}
	public void eat() {
		System.out.println("�л��� ���� �Դ´�");
	}

}
