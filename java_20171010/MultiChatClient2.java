package java_20171010;
import java.net.*;
import java.io.*;
import java.util.*;
public class MultiChatClient2 {
	//FIELD
	Scanner scan;
	Socket s;
	DataOutputStream dos;

	//CONSTRUCTOR
	public MultiChatClient2() {
		try {
			s = new Socket("192.168.100.45", 7000);
			dos = new DataOutputStream(s.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//METHOD

}
class ClientChatter2 extends Thread{
	//FIELD
	DataInputStream dis;

	//CONSTRUCTOR
	public ClientChatter2(Socket s) {
		try {
			dis = new DataInputStream(s.getInputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//METHOD
	public void run() {
		
	}
}