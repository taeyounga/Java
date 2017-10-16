package java_20170928;
import java.net.*;
import java.io.*;
public class SimpleServer2 {
	public static void main(String[] args) {
		//1. 서버 생성: ServerSocket, accept 실행
		ServerSocket server;
		try {
			server = new ServerSocket(7000);
			System.out.println("1. 서버를 생성함.");
			Socket s = server.accept();

		
		//3. 클라이언트로 데이터 송신 : DataOutputStream
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());
			String str = "msg sent from server: 안녕 클라이언트씨";
			dos.write(str.getBytes());
		
		//6. 클라이언트 데이터 수신 : DataInputStream
			DataInputStream dis = new DataInputStream(s.getInputStream());
			byte[] b = new byte[1000];
			dis.read(b);
			System.out.println(new String(b));
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}		
}
