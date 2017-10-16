package java_20170907;
import java.util.Scanner;
public class LeapYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하십시오: ");
		int year = scan.nextInt();
		boolean isLeap;
		isLeap = (year%4==0&&year!=100||year%400==0);
		if(isLeap){
			System.out.println(year+"년은 윤년입니다");
		}else{
			System.out.println(year+"년은 윤년이 아닙니다");
		}
		scan.close();

	}

}
