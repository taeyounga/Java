package java_20170918_figure;

public class Circle extends FigureName implements Figure {
	//FIELD
	String color;
	//CONSTRUCTOR
	public Circle() {
		super("��"); //���۴� �ڽ��� �����Ǳ� �� �θ��� �����ڸ� ȣ���ϴ� ��.
		System.out.println("[�⺻������]Circle Ŭ������ ��ü�� �����մϴ�.");
	}
	//METHOD
	public void draw(){
		System.out.println(color+"���� �׸��ϴ�");
	}
}
