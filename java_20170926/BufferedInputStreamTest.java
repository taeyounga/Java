package java_20170926;
import java.io.*;
public class BufferedInputStreamTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test.txt");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[1000];
			
			while(bis.read(b,0,b.length) != -1) {
				System.out.println(new String(b,0,b.length));
				//파일과 프로그램이 fis라는 연결통로로 연결되어, bis라는 buffer 창고에 쌓이는 구조.
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		
		}
	}
}
