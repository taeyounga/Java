package java_20170919;
abstract public class APerson {
	//FIELD
	static String name, addr;
	static int age;
	//CONSTRUCTOR
	//METHOD
	//getter
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public int getAge() {
		return age;
	}
	//setter
	public void setName(String name) {
		APerson.name = name;
	}
	public void setAge(int age) {
		APerson.age = age;
	}
	public void setAddr(String addr) {
		APerson.addr = addr;
	}
	abstract public void sleep();
	abstract public void eat();
}