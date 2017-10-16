package java_20170922_Exception;
import java.util.*;
public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "자ㅁ바ㅁ프ㅁ로그래밍";
		StringTokenizer st = new StringTokenizer(str, "ㅁ");
		System.out.println("count = " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println("token = "+st.nextToken());
		}
		
	}
}
