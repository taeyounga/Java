/**
 * 제목: 1차원 배열 생성
 */

package java_20170908;

public class ArrayTest1 {
	public static void main(String[] args){
		//데이터타입[] 변수명 = new 데이터타입[생성갯수]
		int[] arr1 = new int[100];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1의 값 = " +arr1);
		System.out.println("arr1.length = "+arr1.length);
		for(int i=0;i<=99;i++){
			System.out.println("arr1["+i+"] = " + arr1[i]);
		}
		
	}

}
