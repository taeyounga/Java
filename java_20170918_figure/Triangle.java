package java_20170918_figure;

public class Triangle extends FigureName implements Figure{
	String color;
	
	//Constructor
	public Triangle() {
		System.out.println("Triangle ��ü�� �����մϴ�.");
	}
	public void draw(){
		System.out.println(color+"�ﰢ���� �׸��ϴ�.");
	}

}
