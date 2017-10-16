package java_20170922_Exception;
import java.util.*;
public class ExceptionTest2 {
	public static void main(String[] args) {
		
		try {
			String[] names = new String[5];
			names[0] = "Ted1";
			names[1] = "Ted2";
			names[2] = "Ted3";
			names[3] = "Ted4";
			names[4] = "Ted5";
			
			for(int i=0; i<7; i++) {
				System.out.println(names[i]);
			}
			
		}catch(Exception e) {
			System.out.println("----Exception ¹ß»ý----");
			e.printStackTrace();
		}
		
		System.out.println("end of first exception");
		
		try {
			StringTokenizer st = null;
			st.countTokens();
		}catch(Exception e) {
			System.out.println("exception 2");
		}finally {
			System.out.println("final");
		}
		
		
	}
}
