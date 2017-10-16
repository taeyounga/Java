package java_20170928;
import java.net.*;
import java.io.*;
import java.util.*;
public class SimpleEchoClient {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			//2. 클라이언트 생성
			Socket s = new Socket("192.168.100.45", 7000);
			
			while(true) {
				//3. 서버로 데이터 송신. 클라이언트가 데이터를 보내면 서버가 데이터를 받아서 그대로 출력 = echo server.
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				System.out.print("enter msg to server: ");
				String str = scan.nextLine();
				dos.write(str.getBytes());
				
				//6. 서버에서 데이터 수신
				DataInputStream dis = new DataInputStream(s.getInputStream());
				byte[] b = new byte[1000];
				dis.read(b);
				System.out.println("서버로부터 온 echo 메시지 = " + new String(b));
				String utf = "";
				System.out.println(dis.readUTF());
			}
			
			
		}catch(Exception e) {
			System.out.println("exception 발생");
		}
	}
}
