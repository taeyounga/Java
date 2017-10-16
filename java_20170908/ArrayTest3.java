package java_20170908;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int [2][2];
		arr[0][0] = 100;
		System.out.println("arr = "+arr);
		System.out.println("arr[0] = "+arr[0]);
		System.out.println("arr[1] = "+arr[1]);
		System.out.println("arr[0][0] = "+arr[0][0]);
		
		//가변형 배열 생성
		int[][] arr2 = new int[2][];
		arr2[0] = new int[3];
		arr2[1] = new int[1];
		
	}

}
