package java_20171010;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiChatServer {
	//FIELD
	ServerSocket server;
	Socket s;
	static ArrayList<DataOutputStream> list = new ArrayList<DataOutputStream>();

	//CONSTRUCTOR
	public MultiChatServer() {
		try {
			server = new ServerSocket(7000);
			System.out.println("서버 실행 중");
			while(true) {
				s = server.accept();
				ServerChatter sc = new ServerChatter(s);
				sc.start();	
				list.add(sc.dos);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//METHOD
}


class ServerChatter extends Thread{
	//FIELD
	DataInputStream dis;
	DataOutputStream dos;

	//CONSTRUCTOR
	public ServerChatter(Socket s) {
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
			while(true) {
				String str = dis.readUTF();
				System.out.println(str);
				broadCasting(str);
				dos.writeUTF(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//broadCasting
	public void broadCasting(String str) {
		try {
			ArrayList<DataOutputStream> list = MultiChatServer.list;
			for(int i=0;i<list.size();i++) {
				DataOutputStream dos = list.get(i);
				
				dos.writeUTF(str);
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	

}