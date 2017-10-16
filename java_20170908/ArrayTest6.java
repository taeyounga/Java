/**
 * 제목: While문을 활용
 */

package java_20170908;
import java.util.Scanner;
public class ArrayTest6 {

	public static void main(String[] args) {
		//문자형 배열 name을 10의 크기로 생성하고, while문으로 반복입력.
		Scanner scan = new Scanner(System.in);
		String name[] = new String[10];
		int i=0;
		while(i<name.length){
			System.out.print("이름을 입력하십시오: ");	
			name[i] = scan.next();
				i++;
			}
		for(int j=0; j<name.length;j++){
			System.out.println("name["+j+"] = "+ name[j]);
		}
		scan.close();
		}
		
		
	}


