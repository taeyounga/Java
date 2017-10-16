package java_20170913;

public class Address {
	//Field(전역변수)
	public String name = "퍼블릭", addr, tel;
	//private String name2 = "프라이빗";
	String name3 = "디폴트";
	
	
	//Constructor
	
	
	//Method
	void print(){
		System.out.println("이름= "+name);
		System.out.println("주소= "+addr);
		System.out.println("연락처= "+tel);
		
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
	
	//메소드 오버로딩의 예시. 구분점은 parameter의 갯수.
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
