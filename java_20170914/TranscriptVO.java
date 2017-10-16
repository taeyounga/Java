package java_20170914;

public class TranscriptVO {
	//FIELD
	private String name;
	private int kor, eng, math, tot;
	private double avg;

	//CONSTRUCTOR
	//METHOD
	//Setter method
	public void setName(String name){
		this.name = name;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	
	
	//Getter method
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
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
