package java_20170911_project;
public class Customer {
	//변수
	int money = 100000;
	String menu = "";
	
	//메소드 정의
	//리턴값 메소드명(){}
	//주문한다
	String order(String menu){
		return menu;
	}
	
	//지불한다
	int pay(){
		return money;
	}
}
