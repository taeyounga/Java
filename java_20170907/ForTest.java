/**
 * 제목: 반복을 위한 for문
 * 다중포문은 2차원 배열에서 데이터 뽑아오는데 유용함!
 */
package java_20170907;

public class ForTest {

	public static void main(String[] args) {
		//구구단 짜기
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