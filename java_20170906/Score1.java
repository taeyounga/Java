/**
 * 제목: 성적표
 */

package java_20170906;

import java.util.Scanner;

public class Score1 {

	public static void main(String[] args) {
		//데이터타입 참조변수 = new 생성자();
		Scanner scan = new Scanner(System.in);
		System.out.print("이름:");
		String name = scan.next();
		System.out.print("국어점수:");
		int kor = scan.nextInt();
		System.out.print("영어점수:");
		int eng = scan.nextInt();
		System.out.print("수학점수:");
		int math = scan.nextInt();
		scan.close();
		
		double tot = kor+eng+math;
		int tot2 = kor+eng+math;
		double avg = (double)tot2/3;
		
		System.out.println("******성적표*******");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg);
		System.out.println(tot);
	}
}