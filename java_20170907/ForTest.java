/**
 * ����: �ݺ��� ���� for��
 * ���������� 2���� �迭���� ������ �̾ƿ��µ� ������!
 */
package java_20170907;

public class ForTest {

	public static void main(String[] args) {
		//������ ¥��
		for(int i=1;i<=9;i++){
			System.out.println();
			for(int j=1;j<=9;j++){
				System.out.print(i+"*"+j+"="+i*j+ "\t");
			}
		}
		System.out.println("");
		for(int i=1;i<=9;i++){
			System.out.println(i);
			
			for(int j=1;j<=9;j++){
				System.out.print(j);
			}
		}
	}
}