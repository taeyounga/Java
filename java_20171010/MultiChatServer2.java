package java_20171010;
import java.net.*;
import java.io.*;
public class MultiChatServer2 {
	//FIELD
	ServerSocket server;
	Socket s;

	//CONSTRUCTOR
	public MultiChatServer2(){
		try {
			server = new ServerSocket(7000);
			System.out.println("서버 실행");
			while(true) {
				s = server.accept();
				ServerChatter2 sc = new ServerChatter2(s);
				sc.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	//METHOD

}
class ServerChatter2 extends Thread{
	//FIELD
	DataInputStream dis;
	DataOutputStream dos;

	//CONSTRUCTOR
	public ServerChatter2(Socket s) {
		try {
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//METHOD
	public void run() {
		try {
			String str = dis.readUTF();
			System.out.println("Msg from Client: " + str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}