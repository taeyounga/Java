package java_20170928;
import java.net.*;
import java.io.*;
import java.util.*;
public class MultiClient extends Thread{

	//FIELD
	Socket s = null;
	DataInputStream dis = null;
	DataOutputStream dos = null;
	Scanner scan = null;

	//CONSTRUCTOR
	public MultiClient() {
		scan = new Scanner(System.in);
		try {
			s = new Socket("192.168.100.45", 7000);
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
		}catch(Exception e) {
			System.out.println("multiclient - exception");
		}
		
	}
	
	
	//METHOD
	public void run() {
		try {
			while(true) {
				//3. client -> server 데이터 송신
				System.out.println("입력> ");
				String str = scan.nextLine();
				dos.write(str.getBytes());
				//4. server -> client 데이터 수신
				byte[] b = new byte[1000];
				dis.read(b);
				System.out.println("Echo msg: " + new String(b));
				
			}
		}catch(Exception e) {
			System.out.println("run - exception");
			e.printStackTrace();
		}
	}

}
