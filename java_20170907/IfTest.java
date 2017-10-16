/**
 * 제목: 조건문(분기문) 단순 if 실습
 */

package java_20170907;
import java.util.Scanner;
public class IfTest {

	public static void main(String[] args) {
		//score 점수를 체크하여 합격결과 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하십시오: ");
		int score = scan.nextInt();
		System.out.print("해당 점수의 등급은 ");
		String result;
		if(score >= 90){
			result = "A";
			//System.out.print("A");
		}else if(score<90&&score>=80){
			result = "B";
			//System.out.print("B");
		}else if(score<80&&score>=70){
			result = "C";
			//System.out.print("C");
		}else if(score<70&&score>=60){
			result = "D";
			//System.out.print("D");
		}else{
			result = "FAIL";
			//System.out.print("FAIL");
		}
		System.out.println(result + "입니다.");
		scan.close();

		
	}

}
