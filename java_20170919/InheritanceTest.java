package java_20170919;

public class InheritanceTest {

	public static void main(String[] args) {
		//Person p = new Person();
		Employee e = new Employee();
		Employee e2 = new Employee("김중위", "11비", 27);
		Student s = new Student();
		President pr = new President();

		e.setName("김대리"); //Employee로 가서 String name을 찾는다. 근데 없다. 그러니 parent로 가서 찾는다.
		System.out.println("name = "+e.getName());
		s.setName("박일등");
		System.out.println("name = "+s.getName());
		
		System.out.println("e2.name = "+e2.getName());
		System.out.println("e2.addr = "+e2.getAddr());
		System.out.println("e2.age = "+e2.getAge());
		
		//p.sleep();
		e.sleep();
		s.sleep();
		pr.sleep();
	}

}
