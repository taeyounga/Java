package java_20170913_clean;

public class AddressVO {
	//FIELD
	private String name, addr, tel; //�������� ����. private ���̴� ������ ���� ��ȣ ����.
	
	//CONSTRUCTOR
	
	//METHOD (�ǵ����̸� method �տ��� public �ٿ�����)
	//Setter Method
	public void setName(String name){
		this.name = name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	
	
	
	//Getter Method
	public String getName(){
		return name;
	}
	public String getAddr(){
		return addr;
	}
	public String getTel(){
		return tel;
	}
	
	
}
