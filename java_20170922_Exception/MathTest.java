package java_20170922_Exception;

public class MathTest {
	public static void main(String[] args) {
		float fval = (float)12.234;
		float fval2 = 12.234f;
		double dval = 1231.1241;
		
		int ival = Math.round(fval2);
		long lval = Math.round(dval);
		
		System.out.println(fval);
		System.out.println(fval2);
		System.out.println(dval);
		System.out.println(lval);
		System.out.println(ival);
		
		//난수 발생
/*		Math.random()
		java.util.Random 클래스*/
		
		double rval1 = Math.random()*100000;
		System.out.println(Math.round(rval1));
	}
}
