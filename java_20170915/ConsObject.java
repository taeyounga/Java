package java_20170915;

public class ConsObject {
	//FIELD
	public String name, age;
	
	//CONSTRUCTOR
	public ConsObject(){
		this("ȫ�浿", "20");
		//this.name = "ȫ�浿";
		//this.age = "20";
	}
	public ConsObject(String name){ //��ü�� ������ �� �̸��� �⺻���� �޾Ƽ� �Է�
		this.name = name;
	}
	/*�̸��� ���̸� �����ڷ� ȣ���Ͽ� �ʱ�ȭ �����غ���*/
	public ConsObject(String name, String age){
		this.name = name;
		this.age = age;
	}
	
	//METHOD
	public String  getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

}
