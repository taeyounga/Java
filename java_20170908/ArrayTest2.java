package java_20170908;

public class ArrayTest2 {

	public static void main(String[] args) {
		String str[] = new String[10];

		
		for(int i = 0; i<str.length; i++){
			str[i] = "�ڹ����α׷���"+i;
			System.out.println("str["+i+"] = " + str[i]);
		}
		
		//arr�̸��� ������ �迭�� 100�� ����� ���� 1���� 100���� ���
		
		int arr[] = new int[100];
		for(int i = 0;i < arr.length; i++){
			arr[i] = i;
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
	}
}
