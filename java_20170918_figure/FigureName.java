package java_20170918_figure;

public class FigureName extends GName{
	//FIELD
	String name;
	
	//CONSTRUCTOR
	public FigureName() {
		System.out.println("[�⺻������]FigureName ��ü�� �����մϴ�.");
	}
	public FigureName(String name) {
		System.out.println("FigureName" + name + "��ü�� �����մϴ�.");
	}
	
	//METHOD
	public String getName() {
		return name;
	}
}
