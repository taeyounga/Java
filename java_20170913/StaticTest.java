package java_20170913;

public class StaticTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println("��ü���� �� static���� = "+ StaticObject.sval); // sval�� ����ƽ�� �÷����ֱ� ������ ��ü ���� ������ ��� ����!
		// System.out.println("�Ϲݺ��� = "+ StaticObject.val); // val�� ����ƽ�� �÷������� �ʱ⶧����, �Ʒ� �ڵ�ó�� ��ü ���� ������ ��� �Ұ���.
		
		StaticObject so = new StaticObject();
		
		System.out.println("static���� = "+ so.sval); //���ױ�ȣ �ߴ� ������, sval�� static������ ���� so��� ��ü ���� ��ȯ ���ص� �Ǵµ� �߱⶧��.
		System.out.println("static���� = "+ StaticObject.sval);
		System.out.println("�Ϲݺ��� = "+ so.val);
		
		so.sMethod(); // sMethod�� Static�� �÷��� �ִµ� ���� ��ü�� ���߱� ������ ���ױ�ȣ. �Ʒ�ó�� �ϸ� ������.
		StaticObject.sMethod();
		so.gMethod();
		
		Math.abs(100.457);
		
		
		
		
	}

}
