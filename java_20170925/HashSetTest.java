package java_20170925;
import java.util.*;
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		//�������߰�
		for(int i=0; i<10; i++) {
			hs.add("name" + i);
		}
		
		//Iterator ��ü�� ��ȯ�Ͽ� ���
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
