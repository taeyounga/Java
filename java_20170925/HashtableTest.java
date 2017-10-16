package java_20170925;

import java.util.*;

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("id", "test");
		ht.put("password", "1234");
		
		Enumeration<String> keyName = ht.keys();
		
		while(keyName.hasMoreElements()) {
			System.out.println(keyName);
		}
		
	}
}
