//하나의 서버, 여러개의 서버쓰레드.
package java_20170928;
import java.net.*;
import java.io.*;
public class MultiServer {
	//FIELD
	ServerSocket server = null;
	Socket s = null;

	//CONSTRUCTOR
	public MultiServer() {
		try {
			server = new ServerSocket(7000);
			System.out.println("서버 실행중");
			
			while(true) {
				s = server.accept();
				System.out.println("클라이언트 접속 완료");
				new ServiceThread(s).start();
			}
		}catch(Exception e) {
			System.out.println("exception");
		}
	}
}
//METHOD
class ServiceThread extends Thread{     //이너 클래스!!!
	//FIELD
	DataInputStream dis = null;
	DataOutputStream dos = null;

	//CONSTRUCTOR
	public ServiceThread() {}
	public ServiceThread(Socket s) {
		try {
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
		}catch(Exception e) {
			System.out.println("servicethread exception");
		}
	}
	//METHOD
	public void run() {
		try {
			

			
			while(true) {
				byte[] b = new byte[1000];
				dis.read(b);
				dos.write(b);
			}
		}catch(Exception e) {
			System.out.println("exception 발생");
			e.printStackTrace();
		}
	}
}