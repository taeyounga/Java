package java_20170908;

public class ArrayTest2 {

	public static void main(String[] args) {
		String str[] = new String[10];

		
		for(int i = 0; i<str.length; i++){
			str[i] = "자바프로그래밍"+i;
			System.out.println("str["+i+"] = " + str[i]);
		}
		
		//arr이름의 정수형 배열을 100개 만들고 값을 1부터 100까지 출력
		
		int arr[] = new int[100];
		for(int i = 0;i < arr.length; i++){
			arr[i] = i;
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
	}
}
