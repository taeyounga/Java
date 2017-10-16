package java_20170918_figure;

public class Circle extends FigureName implements Figure {
	//FIELD
	String color;
	//CONSTRUCTOR
	public Circle() {
		super("원"); //수퍼는 자신이 생성되기 전 부모의 생성자를 호출하는 것.
		System.out.println("[기본생성자]Circle 클래스의 객체를 생성합니다.");
	}
	//METHOD
	public void draw(){
		System.out.println(color+"원을 그립니다");
	}
}
