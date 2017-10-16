package java_20170918_car;

public class Taxi extends Car {
	//FIELD
	//CONSTRUCTOR
	//METHOD
	public void receiveFare(){
		System.out.println("요금을 받는다.");
	}
	
	public void drive(){};
	public void speed(int val){
		System.out.println(val+"만큼 속도를 낸다.");
	}
}
