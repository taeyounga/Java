package java_20170919;

public class InheritanceTest {

	public static void main(String[] args) {
		//Person p = new Person();
		Employee e = new Employee();
		Employee e2 = new Employee("������", "11��", 27);
		Student s = new Student();
		President pr = new President();

		e.setName("��븮"); //Employee�� ���� String name�� ã�´�. �ٵ� ����. �׷��� parent�� ���� ã�´�.
		System.out.println("name = "+e.getName());
		s.setName("���ϵ�");
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
