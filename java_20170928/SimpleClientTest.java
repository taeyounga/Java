package java_20170928;
import java.net.*;
import java.io.*;
public class SimpleClientTest {
public static void main(String[] args) {
	try {
		Socket s = new Socket("192.168.100.45", 7000);
		System.out.println("2. 클라이언트: 서버로 접속 성공");
		Thread.sleep(2000);
		
		//서버에서 전송된 데이터 수신
		
		InputStream is = s.getInputStream();
		byte[] b = new byte[1000];
		is.read(b, 0, b.length); //아니면 그냥 is.read(b)만 하면 자동으로 0번지부터 끝까지 채움
		System.out.println("4. 클라이언트는 서버로부터 다음 메세지를 받는다.\r\t " + new String(b));
		Thread.sleep(2000);
		
		//서버로 데이터 전송
		OutputStream os = s.getOutputStream();
		String str = "클라이언트: 안녕하세요 서버님";
		Thread.sleep(2000);
		os.write(str.getBytes());
		System.out.println("5. 클라이언트: 서버로 데이터전송 완료");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
