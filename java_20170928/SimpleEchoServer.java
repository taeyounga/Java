package java_20170928;
import java.net.*;
import java.io.*;
public class SimpleEchoServer {
	public static void main(String[] args) {
		//1. 서버생성
		try {

			ServerSocket server = new ServerSocket(7000);
			
			System.out.println("서버실행중");
			while(true) {
			Socket s = server.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());

				//4. 클라이언트가 보낸 데이터 수신
				byte[] b = new byte[1000];
				dis.read(b);
				
				//5. 클라이언트로 데이터 송신
				dos.write(b);
				dos.writeUTF("utf송신 테스트");
				
			}
			
			
		}catch(Exception e) {
			System.out.println("exception 발생");
		}
	}
}
