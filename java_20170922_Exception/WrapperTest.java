package java_20170922_Exception;

public class WrapperTest {
	public static void main(String[] args) {
		String age = "20";
		int age2 = Integer.parseInt(age);
		double age3 = Double.parseDouble(age);
		Double age4 = Double.valueOf(age3);
		
		int num = 1234;
		double dnum = 15.1234;
		String snum = String.valueOf(num);
		String snum2 = String.valueOf(dnum);
		
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
		System.out.println(snum);
		System.out.println(snum2);
		System.out.println(dnum);
		
	}
}
