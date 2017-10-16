package java_20170918_person;

public class Actor extends Person {
	//FIELD
	String bestFilm;
	
	//CONSTRUCTOR
	//METHOD
	public void acting(){
		System.out.println("연기를 한다");
	}
	public void exercise(){ //Parent에 있는 exercise() 오버라이딩.
		System.out.println("배우가 운동하다");
	}

}
