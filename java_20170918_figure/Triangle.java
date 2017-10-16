package java_20170918_figure;

public class Triangle extends FigureName implements Figure{
	String color;
	
	//Constructor
	public Triangle() {
		System.out.println("Triangle 객체를 생성합니다.");
	}
	public void draw(){
		System.out.println(color+"삼각형을 그립니다.");
	}

}
