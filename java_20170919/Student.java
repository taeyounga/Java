package java_20170919;

public class Student extends GPerson implements GInterface{
	//FIELD
	String school;
	int grade;
	//CONSTRUCTOR
	public Student() {
		System.out.println("Student의 기본생성자");
	}
	//METHOD
	public void sleep() {
		System.out.println("학생이 잠을잔다");
	}
	public void eat() {
		System.out.println("학생이 밥을 먹는다");
	}

}
