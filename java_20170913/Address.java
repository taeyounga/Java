package java_20170913;

public class Address {
	//Field(��������)
	public String name = "�ۺ�", addr, tel;
	//private String name2 = "�����̺�";
	String name3 = "����Ʈ";
	
	
	//Constructor
	
	
	//Method
	void print(){
		System.out.println("�̸�= "+name);
		System.out.println("�ּ�= "+addr);
		System.out.println("����ó= "+tel);
		
	}
	
	String getName(){
		return name;
	}
	String getAddr(){
		return addr;
	}
	String getTel(){
		return tel;
	}
	
	//�޼ҵ� �����ε��� ����. �������� parameter�� ����.
	void setAddress(String name, String addr, String tel){
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	void setAddress(String name, String addr){
		this.name = name;
		this.addr = addr;
	}
	void setAddress(String name){
		this.name = name;
	}
}
