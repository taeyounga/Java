package java_20170913;

public class AddressBook {
	static String str = "static test";
	String test = "test";
	
	public static void main(String[] args) {
		System.out.println("str = "+ str);
		//Address Ŭ������ �ε��Ͽ� ��ü�� ����
		Address address = new Address();
		
		address.print();
		
		//���������� �ǽ�
		System.out.println("�̸� = "+address.name); //�ܺο��� ��ü�� ���� ���� ����.
		//System.out.println("�̸�2 = "+address.name2); //Address.class���ϻ� name2�� private String�̱⿡ �ܺο��� ��ü�� ���� ���� �Ұ�.
		System.out.println("�̸�3 = "+address.name3); //name3�� default String�̱⿡, ���� ��Ű������ ��ü�� ���� ���� ����.
			
		/*
		String name = address.getName();
		System.out.println("getName() = " + name);
		address.setAddress("����", "����", "7894");
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
