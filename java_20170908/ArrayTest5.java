/**
 * 제목: 이름을 입력받아 5개까지 저장한 후 전체 출력
 */

package java_20170908;
import java.util.Scanner;
public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		String[] list = new String[5];
		for(int i=0;i<list.length;i++){
			System.out.print((i+1)+"/"+list.length+" 번째 이름을 입력하십시오: ");
			String name = scan.next();
			list[i] = name;
						
		}
		scan.close();
		for(int i=0;i<list.length;i++){
			System.out.println("list["+i+"] = "+list[i]);
		}
		*/
		
		/*이름, 점수 입력 후 출력
		String[] namelist = new String[5];
		int[] scorelist = new int[5];
		
		for(int i=0;i<namelist.length;i++){
			System.out.print((i+1)+"/"+namelist.length+" 번째 이름을 입력하십시오: ");
			String name = scan.next();
			namelist[i] = name;
			System.out.print((i+1)+"/"+scorelist.length+" 번째 점수을 입력하십시오: ");
			int score = scan.nextInt();
			scorelist[i] = score;
						
		}
		scan.close();
		for(int i=0;i<namelist.length;i++){
			System.out.println("namelist["+i+"] = "+namelist[i]+"\t\t"+"scorelist["+i+"] = "+scorelist[i]);
		}
		*/
		String[] namelist = new String[5];
		int[][] scorelist = new int[5][3];
		String[] subjectlist = new String[3];
		subjectlist[0] = "국어";		
		subjectlist[1] = "영어";		
		subjectlist[2] = "수학";		

		for(int i=0;i<namelist.length;i++){
			System.out.print((i+1)+"/"+namelist.length+" 번째 이름을 입력하십시오: ");
			String name = scan.next();
			namelist[i] = name;
			
			for(int j=0;j<scorelist[i].length;j++){
				System.out.print(namelist[i]+"의 "+subjectlist[j]+" 점수을 입력하십시오: ");
				int score = scan.nextInt();
				scorelist[i][j] = score;
			}
						
		}
		scan.close();
		System.out.println("이름\t국어점수\t영어점수\t수학점수");
		for(int i=0;i<namelist.length;i++){
			System.out.print(namelist[i]+"\t");
			
			for(int j=0;j<scorelist[i].length;j++){
				System.out.print(scorelist[i][j]+"\t");
			}
			System.out.println();
		}

		
		
	}

}
