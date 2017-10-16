package java_20170922_Exception;
import java.util.*;
public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "�ڤ��٤������α׷���";
		StringTokenizer st = new StringTokenizer(str, "��");
		System.out.println("count = " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println("token = "+st.nextToken());
		}
		
	}
}
