package java_20170919;
public class GPerson {
	//FIELD
	String name, addr;
	int age;
	//CONSTRUCTOR
	public GPerson() {
		System.out.println("GPerson 기본생성자 호출");
	}
	public GPerson(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	//METHOD
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
