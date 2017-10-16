package java_20170913_clean;

public class AddressVO {
	//FIELD
	private String name, addr, tel; //전역변수 생성. private 붙이는 이유는 변수 보호 위함.
	
	//CONSTRUCTOR
	
	//METHOD (되도록이면 method 앞에는 public 붙여주자)
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
