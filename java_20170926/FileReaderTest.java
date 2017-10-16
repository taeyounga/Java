package java_20170926;
import java.io.*;
public class FileReaderTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			char[] c = new char[1000];
			
			fr.read(c);
			System.out.println(new String(c));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
