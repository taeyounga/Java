package java_20170929;
import java.io.*;
import java.net.*;
import java.nio.file.attribute.DosFileAttributes;
import java.util.*;
public class MultiChatServer {
	//FIELD
	ServerSocket server;
	Socket s;
	static ArrayList<DataOutputStream> list = new ArrayList<DataOutputStream>();

	//CONSTRUCTOR
	public MultiChatServer() {}
	public MultiChatServer(int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("서버를 시작합니다");
			while(true) {
				s = server.accept();
				ServiceThread st = new ServiceThread(s);
				st.start();
				list.add(st.dos);
				System.out.println(list.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//METHOD

}

class ServiceThread extends Thread{
	//FIELD
	DataInputStream dis;
	DataOutputStream dos;

	//CONSTRUCTOR
	public ServiceThread(Socket s) {
		
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
		
		dos.write(new String("환영합니다.").getBytes());
		
		while(true) {
			byte[] b = new byte[1000];
			dis.read(b);
			//dos.write(b);
			broadcasting(b);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void broadcasting(byte[] b) {
	for(int i=0; i<MultiChatServer.list.size(); i++) {
		DataOutputStream dos = MultiChatServer.list.get(i);
		try {
			dos.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}