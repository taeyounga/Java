package java_20170928;
import java.net.*;
import java.io.*;
public class ClientThread extends Thread{
	//FIELD

	//CONSTRUCTOR

	//METHOD
	public void run() {
		while(true) {
			socketConnect();
		}
	}
	
	static public void socketConnect() {
		try {
			Socket s = new Socket("192.168.100.45", 7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
