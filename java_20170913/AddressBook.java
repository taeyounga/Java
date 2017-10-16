package java_20170913;

public class AddressBook {
	static String str = "static test";
	String test = "test";
	
	public static void main(String[] args) {
		System.out.println("str = "+ str);
		//Address 클래스를 로딩하여 객체로 생성
		Address address = new Address();
		
		address.print();
		
		//접근제어자 실습
		System.out.println("이름 = "+address.name); //외부에서 객체를 통해 접근 가능.
		//System.out.println("이름2 = "+address.name2); //Address.class파일상 name2는 private String이기에 외부에서 객체를 통해 접근 불가.
		System.out.println("이름3 = "+address.name3); //name3은 default String이기에, 같은 패키지에서 객체를 통해 접근 가능.
			
		/*
		String name = address.getName();
		System.out.println("getName() = " + name);
		address.setAddress("공유", "서울", "7894");
		address.print();
		address.print();
		System.out.println("getName() = " + name);
		*/
	
	}
	void test(){
		System.out.println(str);
		System.out.println(test);
	}

}
