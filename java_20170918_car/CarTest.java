package java_20170918_car;

public class CarTest {

	public static void main(String[] args) {
		//택시 객체를 생성하고 메소드를 호출
		Taxi taxi = new Taxi();
		taxi.drive();
		taxi.speed(80);
		
		Taxi taxi2 = new Taxi();
		taxi2.drive();
		
		//버스 객체를 생성하고 메소드를 호출
/*		Car bus = new Car();
		bus.drive();
		bus.speed(60);*/
	}
}
