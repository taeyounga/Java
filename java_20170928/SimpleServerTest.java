package java_20170928;
import java.net.*;
import java.io.*;
public class SimpleServerTest {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7000);
			
			System.out.println("1. 서버 실행");
			Socket s = server.accept();
			Thread.sleep(2000);
			
			//클라이언트에게 환영인사 전송
			OutputStream os = s.getOutputStream();
			String str = "서버: 환영합니다.";
			os.write(str.getBytes());
			Thread.sleep(2000);
			System.out.println("3. 서버: 환영인사 전송 완료!");
			Thread.sleep(2000);
			
			//클라이언트의 데이터 수신
			InputStream is = s.getInputStream();
			byte[] b = new byte[1000];
			is.read(b,0,b.length);
			System.out.println("6. 서버는 클라이언트로부터 다음 메시지를 받았다.\r\t" + new String(b));

		}catch(Exception e) {
			System.out.println("Exception 발생");
		}
	}
}
