package java_20170907;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class LoginCheck {

	public static void main(String[] args) {
		//���� ����� ID, PW����
		String did = "admin";
		String dpw = "adminpw@";
		
		String uid;
		String upw;
		//Scanner ����
		Scanner scan = new Scanner(System.in);
		//ID�Է�
		System.out.print("ID�� �Է��Ͻʽÿ�: ");
		uid = scan.next();
		//PW�Է�
		System.out.print("PW�� �Է��Ͻʽÿ�: ");
		upw = scan.next();
		//�ε� ������
		System.out.println("Ȯ����...");
		new Timer().schedule(
				new TimerTask(){
					@Override
					public void run(){
						if(did.equals(uid)){
							if(dpw.equals(upw)){
								System.out.println("�α��� ����!");
							}else{
								System.out.println("�α��� ���� - PW�� Ȯ���Ͻʽÿ�.");
							}
						}else{
							System.out.println("�α��� ���� - ID�� Ȯ���Ͻʽÿ�.");
						}
					}
				}, 3000
		);
		//������
		scan.close();
		
	}

}
