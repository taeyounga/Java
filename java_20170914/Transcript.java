package java_20170914;
import java.util.*;
import java.text.DecimalFormat; //�Ҽ��� ����
public class Transcript {
	public static void main(String[] args){
		
		//��ĳ�� Ŭ���� ����
		Scanner scan = new Scanner(System.in);
		//���� ����
		Vector<TranscriptVO> list = new Vector<TranscriptVO>();
		//TranscriptVO ��ü ����
		//���� ����
		int kor, eng, math;
		boolean flag = true;
		
		//������ SETTING
		String addData;
		
		//�̰��� avg�� �Ҽ����� �ʹ� ������ �Ҽ��� ����.
		DecimalFormat df = new DecimalFormat("####0.00");     
		
		while(flag){
			TranscriptVO vo = new TranscriptVO();
			System.out.print("������ �Է��Ͻðڽ��ϱ�?)y/n: ");
			addData = scan.next();
			if(addData.equals("y")){
				System.out.print("�̸�>");
				vo.setName(scan.next());
				System.out.print("����>");
				kor = scan.nextInt();
				vo.setKor(kor);
				System.out.print("����>");
				eng = scan.nextInt();
				vo.setEng(eng);
				System.out.print("����>");
				math = scan.nextInt();
				vo.setMath(math);
				list.add(vo);
			}else flag = false;
		}
		scan.close();
		
		
		//������ GETTING
		System.out.println("**********************��� ���************************");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("----------------------------------------------------");
		for(int i=0;i<list.size();i++){
			TranscriptVO output = (TranscriptVO)list.get(i);
			System.out.println((i+1) +"\t"+ output.getName() +"\t"+ output.getKor() +"\t"+ output.getEng() +"\t"+ output.getMath() +"\t"+ output.getTot() +"\t"+ df.format(output.getAvg()));
		}
		System.out.println("----------------------------------------------------");
		System.out.println("end of code.");
	}

}
