package java_20170926;

public class ThreadClass implements Runnable{
	//FIELD
	String name;
	Phone phone;
	
	//CONSTRUCTOR
	public ThreadClass() {}
	public ThreadClass(String name) {
		this.name = name;
	}
	public ThreadClass(String name, Phone phone) {
		this.name = name;
		this.phone = phone;
	}
	
	//METHOD
	public void run() {
		phone.calling(name);
		
/*		try {
			Thread.sleep(1000);  //API ���� sleep�޼ҵ�� static void. �׷��� Thread.sleep �� �� ����.
		}catch(Exception e) {
			System.out.println("Exception���� �߻�");
		}
		
		print();
		*/
	}
	
	public void print() {
		for(int i = 0;i<20;i++) {
			System.out.println((i+1) + "�̸��� " + name + "�Դϴ�.");
		}
	}
	
	
}
