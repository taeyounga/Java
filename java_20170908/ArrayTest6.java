/**
 * ����: While���� Ȱ��
 */

package java_20170908;
import java.util.Scanner;
public class ArrayTest6 {

	public static void main(String[] args) {
		//������ �迭 name�� 10�� ũ��� �����ϰ�, while������ �ݺ��Է�.
		Scanner scan = new Scanner(System.in);
		String name[] = new String[10];
		int i=0;
		while(i<name.length){
			System.out.print("�̸��� �Է��Ͻʽÿ�: ");	
			name[i] = scan.next();
				i++;
			}
		for(int j=0; j<name.length;j++){
			System.out.println("name["+j+"] = "+ name[j]);
		}
		scan.close();
		}
		
		
	}


