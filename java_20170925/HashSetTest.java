package java_20170925;
import java.util.*;
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		//데이터추가
		for(int i=0; i<10; i++) {
			hs.add("name" + i);
		}
		
		//Iterator 객체로 전환하여 출력
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
