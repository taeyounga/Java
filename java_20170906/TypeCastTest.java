/**
 * ����: ����ȯ �׽�Ʈ
 */
package java_20170906;

public class TypeCastTest {

	public static void main(String[] args) {
		// �⺻�� ������ Ÿ���� ����ȯ�� ��������� ����
		byte bval = 127;
		int ival = 1000;
		
		System.out.println(ival);
		System.out.println(bval);
		bval = (byte)ival;
		System.out.println(bval);

	}

}
