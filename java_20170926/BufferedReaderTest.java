package java_20170926;
import java.io.*;
public class BufferedReaderTest {
	public static void main(String[] args) {
		File file = new File("d:\\ty\\test.txt");
		try {
			FileReader fr = new FileReader(file);
			//BufferedInputStream bis = new BufferedInputStream(fr); 이건 안됨. 
			BufferedReader br = new BufferedReader(fr);
			//창고에 계속 가서 읽어야 하기 때문에 while을 써야함.
			String str = "";
			while((str = br.readLine()) != null)		//null이 아니면 데이터가 있으니, 데이터를 읽어오라
				System.out.println(str);
		}catch(Exception e) {
			
		}
	}
}
