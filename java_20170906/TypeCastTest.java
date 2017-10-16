/**
 * 제목: 형변환 테스트
 */
package java_20170906;

public class TypeCastTest {

	public static void main(String[] args) {
		// 기본형 데이터 타입의 형변환은 저장공간의 차이
		byte bval = 127;
		int ival = 1000;
		
		System.out.println(ival);
		System.out.println(bval);
		bval = (byte)ival;
		System.out.println(bval);

	}

}
