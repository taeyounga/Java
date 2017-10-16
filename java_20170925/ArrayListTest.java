package java_20170925;
import java.util.*;
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<ArrayVO> list = new ArrayList<ArrayVO>();
		for(int i = 0 ; i < 10 ; i++) {
			ArrayVO vo = new ArrayVO();
			vo.setCity("city" + i);
			vo.setName("name" + i);
			list.add(vo);
		}
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("city = " + list.get(i).getCity() + "\t");
			System.out.println("name = " + list.get(i).getName());
		}
		
		Iterator<ArrayVO> it = list.iterator();
		System.out.println("-----------Iterator °´Ã¼ Ãâ·Â--------");
		while(it.hasNext()) {
			ArrayVO vo = it.next();
			System.out.print("city = " + vo.getCity() + "\t");
			System.out.println("name = " + vo.getName());
		}
	}
}
