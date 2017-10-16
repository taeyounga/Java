package java_20170926;
import java.io.*;
public class FileWriterTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			String str = "filewrite를 이용해 전송";
			fw.write(str);
			System.out.println("데이터 전송 완료");
			//fw.flush();
			//fw.write(cbuf, off, len);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
