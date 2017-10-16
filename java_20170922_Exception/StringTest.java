package java_20170922_Exception;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		
		StringBuffer sb = new StringBuffer();
		sb.append("자바");
		sb.append("프로그래밍");
		sb.append("재밌다");
		sb.append("스트링버퍼를 쓰면 하나의 개체만 만들어진다.");
		System.out.println(sb);
		
		
		
	}
}
