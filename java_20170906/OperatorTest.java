package java_20170906;

public class OperatorTest {
	public static void main(String[] args){
		//���� ������: x++, ++x. �ϳ��� ������ ������
		//���� ������: 1 + 1 = 2
		//��Ģ ������: +, -, *, / �����ڸ� �̿��Ͽ� ������
		int num1 = 10, num2 = 20;
		System.out.println("+++++++++��Ģ����++++++++++");
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + num1 * num2);
		System.out.println("num1 / num2 = " + num1 / num2);
		
		int i = 10;
		System.out.println("\r+++++++++����������+++++++++");
		System.out.println("++i = " + ++i);
		System.out.println(i);
		System.out.println("i++ = " + i++);
		System.out.println(i);

		//���迬����(�񱳿�����)
		/**
		 * A > B, A == B, A != B
		 */
		
		int val1 = 10, val2 = 10;
		System.out.println(val1 == val2);
		byte str1 = 10;
		System.out.println(val1 == str1);
		
		boolean result1 = (val1 == val2);
		boolean result2 = (val1 > val2);
		System.out.println("val1 == val2: " + result1);
		System.out.println("val1 > val2: " + result2);
		
		//Shortcut(����) ������ - OR(||), AND(&&)
		//(���迬���) || (���迬���), ((���迬���) && (���迬���)
		//(val1 == val2) || (val1 > val2)
		boolean result3 = (val1 == val2) || (val1 > val2);
		System.out.println("\r++++++����(shortcut) ������++++++");
		System.out.println("(val1 == val2) || (val1 > val2) : "+result3);
		
		//���׿�����
		//(���ǽ�)? ���ǽ��� ����� ���ΰܿ� ��µǴ� �� : ������� ��µǴ� ��
		int a=10, b=20;
		String result4 = (a==b)? "��":"����";
		System.out.println("(a==b)? '��':'����' ==> " + result4);
	}

}
