package java_20170919;

public class Employee extends GPerson implements GInterface{
	//FIELD
	String dept;
	int salary;
	
	//CONSTRUCTOR
	public Employee() {
		System.out.println("Employee의 기본생성자");
	}
	public Employee(String name, String addr, int age) {
		super(name, addr, age); //name값을 부모에 전달.
	}
	
	//METHOD
	public void sleep() {
		System.out.println("직원이 잠을 잔다");
	}
	public void eat() {
		System.out.println("직원이 밥을 먹는다");
	}

}
