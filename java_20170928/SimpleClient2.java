package java_20170928;
import java.net.*;
import java.io.*;
public class SimpleClient2 {
	public static void main(String[] args) {
		//2. Socket객체 생성 - 서버로 접속
		try {
			Socket s = new Socket("192.168.100.45", 7000);
			System.out.println("2. 클라이언트: 서버로 접속완료");
		
		//4. 서버의 데이터 수신
			InputStream is = s.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			byte[] b = new byte[1000];
			dis.read(b);
			System.out.println(new String(b));

			//5. 서버로 데이터 송신
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			String str = "msg sent from the client: 반가워요 서버";
			dos.write(str.getBytes());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
