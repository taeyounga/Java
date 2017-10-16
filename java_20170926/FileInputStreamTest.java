package java_20170926;
import java.io.*;
public class FileInputStreamTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test.txt");
		byte[] farray = new byte[100];
		
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			fis.read(farray);
			System.out.println(farray);
			System.out.println(new String(farray));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
