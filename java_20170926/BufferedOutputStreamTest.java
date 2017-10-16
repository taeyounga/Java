package java_20170926;
import java.io.*;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test.txt");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			String str = "bos객체를 이용해 전송합니다. \r\n";
			
			bos.write(str.getBytes());
			bos.flush();
			
			System.out.println("글 쓰기 종료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
