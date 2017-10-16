package java_20170926;
import java.io.*;
public class BufferedWriterTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test.txt");
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			String str = "버퍼드 라이터로 전송";
			bw.write(str);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
