package java_20170913;

public class StaticTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println("개체생성 전 static변수 = "+ StaticObject.sval); // sval은 스태틱에 올려져있기 때문에 개체 생성 전에도 사용 가능!
		// System.out.println("일반변수 = "+ StaticObject.val); // val은 스태틱에 올려져있지 않기때문에, 아래 코드처럼 개체 생성 전에는 사용 불가능.
		
		StaticObject so = new StaticObject();
		
		System.out.println("static변수 = "+ so.sval); //워닝기호 뜨는 이유는, sval은 static변수라서 굳이 so라는 개체 통해 소환 안해도 되는데 했기때문.
		System.out.println("static변수 = "+ StaticObject.sval);
		System.out.println("일반변수 = "+ so.val);
		
		so.sMethod(); // sMethod는 Static에 올려져 있는데 굳이 개체를 통했기 때문에 워닝기호. 아래처럼 하면 없어짐.
		StaticObject.sMethod();
		so.gMethod();
		
		Math.abs(100.457);
		
		
		
		
	}

}
