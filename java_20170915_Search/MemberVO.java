package java_20170915_Search;

public class MemberVO {
	//FIELD
	String name, national; //나중 DB에 들어가는 Table과 1:1로 연결됨. 이 필드 정의가 매우 중요!!
	int height, weight;
	//CONSTRUCTOR
	public MemberVO(){} //기본생성자
	public MemberVO(String name, int height, int weight, String national){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.national = national;
	}
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getNational() {
		return national;
	}
	public void setNational(String national) {
		this.national = national;
	}
}
