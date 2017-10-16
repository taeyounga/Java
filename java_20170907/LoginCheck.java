package java_20170907;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class LoginCheck {

	public static void main(String[] args) {
		//기존 저장된 ID, PW정보
		String did = "admin";
		String dpw = "adminpw@";
		
		String uid;
		String upw;
		//Scanner 생성
		Scanner scan = new Scanner(System.in);
		//ID입력
		System.out.print("ID를 입력하십시오: ");
		uid = scan.next();
		//PW입력
		System.out.print("PW를 입력하십시오: ");
		upw = scan.next();
		//로딩 딜레이
		System.out.println("확인중...");
		new Timer().schedule(
				new TimerTask(){
					@Override
					public void run(){
						if(did.equals(uid)){
							if(dpw.equals(upw)){
								System.out.println("로그인 성공!");
							}else{
								System.out.println("로그인 실패 - PW를 확인하십시오.");
							}
						}else{
							System.out.println("로그인 실패 - ID를 확인하십시오.");
						}
					}
				}, 3000
		);
		//결과출력
		scan.close();
		
	}

}
