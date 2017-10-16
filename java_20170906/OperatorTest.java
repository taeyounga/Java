package java_20170906;

public class OperatorTest {
	public static void main(String[] args){
		//단항 연산자: x++, ++x. 하나의 항으로 구성됨
		//이항 연산자: 1 + 1 = 2
		//사칙 연산자: +, -, *, / 연산자를 이용하여 구성함
		int num1 = 10, num2 = 20;
		System.out.println("+++++++++사칙연산++++++++++");
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + num1 * num2);
		System.out.println("num1 / num2 = " + num1 / num2);
		
		int i = 10;
		System.out.println("\r+++++++++증감연산자+++++++++");
		System.out.println("++i = " + ++i);
		System.out.println(i);
		System.out.println("i++ = " + i++);
		System.out.println(i);

		//관계연산자(비교연산자)
		/**
		 * A > B, A == B, A != B
		 */
		
		int val1 = 10, val2 = 10;
		System.out.println(val1 == val2);
		byte str1 = 10;
		System.out.println(val1 == str1);
		
		boolean result1 = (val1 == val2);
		boolean result2 = (val1 > val2);
		System.out.println("val1 == val2: " + result1);
		System.out.println("val1 > val2: " + result2);
		
		//Shortcut(논리식) 연산자 - OR(||), AND(&&)
		//(관계연산식) || (관계연산식), ((관계연산식) && (관계연산식)
		//(val1 == val2) || (val1 > val2)
		boolean result3 = (val1 == val2) || (val1 > val2);
		System.out.println("\r++++++논리식(shortcut) 연산자++++++");
		System.out.println("(val1 == val2) || (val1 > val2) : "+result3);
		
		//삼항연산자
		//(조건식)? 조건식의 결과가 참인겨우 출력되는 값 : 거짓경우 출력되는 값
		int a=10, b=20;
		String result4 = (a==b)? "참":"거짓";
		System.out.println("(a==b)? '참':'거짓' ==> " + result4);
	}

}
