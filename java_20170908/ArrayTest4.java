package java_20170908;

public class ArrayTest4 {
	public static void main(String[] args){
		//정수형 배열2행, 3열 생성
		int[][] arr = new int[2][3];
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println("arr[0][0] = "+arr[0][0]);
		System.out.println("arr[0][1] = "+arr[0][1]);
		System.out.println("arr[0][2] = "+arr[0][2]);
		System.out.println("arr[0][0] = "+arr[1][0]);
		System.out.println("arr[1][1] = "+arr[1][1]);
		System.out.println("arr[2][2] = "+arr[1][2]);
		*/
		int val = 10;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = val;
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
				val += 10;
			}
		}
	}

}
