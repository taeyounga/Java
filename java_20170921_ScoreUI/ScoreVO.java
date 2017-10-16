package java_20170921_ScoreUI;

public class ScoreVO {
	//FIELD
	String name; //���� DB�� ���� Table�� 1:1�� �����. �� �ʵ� ���ǰ� �ſ� �߿�!!
	int kor, eng, math, tot;
	double avg;
	//CONSTRUCTOR
	public ScoreVO(){} //�⺻������
	public ScoreVO(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTot(){
		tot = kor+eng+math;
		return tot;
	}
	public double getAvg(){
		avg = (double)tot/3;
		return avg;
	}

}
