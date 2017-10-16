//파일에 관한 정보 확인
package java_20170926;
import java.io.*;
public class FileTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test.txt");
		
		if(file.exists()) {
			System.out.println("File exists");
			System.out.println("File path = " + file.getAbsolutePath());
		}else {
			try {
				file.createNewFile();
				System.out.println("File does not exist. New File created");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}