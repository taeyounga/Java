package java_20170918_figure;

public class FigureName extends GName{
	//FIELD
	String name;
	
	//CONSTRUCTOR
	public FigureName() {
		System.out.println("[기본생성자]FigureName 객체를 생성합니다.");
	}
	public FigureName(String name) {
		System.out.println("FigureName" + name + "객체를 생성합니다.");
	}
	
	//METHOD
	public String getName() {
		return name;
	}
}
