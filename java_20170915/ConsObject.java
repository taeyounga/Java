package java_20170915;

public class ConsObject {
	//FIELD
	public String name, age;
	
	//CONSTRUCTOR
	public ConsObject(){
		this("홍길동", "20");
		//this.name = "홍길동";
		//this.age = "20";
	}
	public ConsObject(String name){ //객체를 생성할 때 이름을 기본으로 받아서 입력
		this.name = name;
	}
	/*이름과 나이를 생성자로 호출하여 초기화 진행해보자*/
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
