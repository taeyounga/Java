package java_20170928;
import java.io.*;
import java.net.*;
public class ServerThread {

	public void acceptClient() {
		try {
			ServerSocket server = new ServerSocket(7000);
			Socket s = server.accept();
			ClientThread.socketConnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
