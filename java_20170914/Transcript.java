package java_20170914;
import java.util.*;
import java.text.DecimalFormat; //소숫점 제한
public class Transcript {
	public static void main(String[] args){
		
		//스캐너 클래스 생성
		Scanner scan = new Scanner(System.in);
		//벡터 생성
		Vector<TranscriptVO> list = new Vector<TranscriptVO>();
		//TranscriptVO 객체 생성
		//변수 생성
		int kor, eng, math;
		boolean flag = true;
		
		//데이터 SETTING
		String addData;
		
		//미관상 avg의 소숫점이 너무 많으니 소숫점 제한.
		DecimalFormat df = new DecimalFormat("####0.00");     
		
		while(flag){
			TranscriptVO vo = new TranscriptVO();
			System.out.print("성적을 입력하시겠습니까?)y/n: ");
			addData = scan.next();
			if(addData.equals("y")){
				System.out.print("이름>");
				vo.setName(scan.next());
				System.out.print("국어>");
				kor = scan.nextInt();
				vo.setKor(kor);
				System.out.print("영어>");
				eng = scan.nextInt();
				vo.setEng(eng);
				System.out.print("수학>");
				math = scan.nextInt();
				vo.setMath(math);
				list.add(vo);
			}else flag = false;
		}
		scan.close();
		
		
		//데이터 GETTING
		System.out.println("**********************출력 결과************************");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		for(int i=0;i<list.size();i++){
			TranscriptVO output = (TranscriptVO)list.get(i);
			System.out.println((i+1) +"\t"+ output.getName() +"\t"+ output.getKor() +"\t"+ output.getEng() +"\t"+ output.getMath() +"\t"+ output.getTot() +"\t"+ df.format(output.getAvg()));
		}
		System.out.println("----------------------------------------------------");
		System.out.println("end of code.");
	}

}
