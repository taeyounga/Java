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
			Thread.sleep(1000);  //API 보면 sleep메소드는 static void. 그러니 Thread.sleep 쓸 수 있음.
		}catch(Exception e) {
			System.out.println("Exception오류 발생");
		}
		
		print();
		*/
	}
	
	public void print() {
		for(int i = 0;i<20;i++) {
			System.out.println((i+1) + "이름이 " + name + "입니다.");
		}
	}
	
	
}
