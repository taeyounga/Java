package java_20170919;

public class Employee extends GPerson implements GInterface{
	//FIELD
	String dept;
	int salary;
	
	//CONSTRUCTOR
	public Employee() {
		System.out.println("Employee�� �⺻������");
	}
	public Employee(String name, String addr, int age) {
		super(name, addr, age); //name���� �θ� ����.
	}
	
	//METHOD
	public void sleep() {
		System.out.println("������ ���� �ܴ�");
	}
	public void eat() {
		System.out.println("������ ���� �Դ´�");
	}

}
