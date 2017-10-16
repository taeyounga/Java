package java_20170926;
import java.io.*;
public class FileOutputStreamTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test2.txt");
		try {
		if(file.exists()) {
			System.out.println("File already exists.");
			String str = "Input added to: test2.txt11112113가나다ㅁㄴㅇㅁㄴㅇㅁㄴ\rasda";
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(str.getBytes());
		}else {
				file.createNewFile();
				String str = "Input added to: test2.txt2222";
				FileOutputStream fos = new FileOutputStream(file);
				fos.write(str.getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
