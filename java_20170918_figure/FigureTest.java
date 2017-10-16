package java_20170918_figure;

public class FigureTest {

	public static void main(String[] args) {
		Circle redCircle = new Circle();
		/*Circle blueCircle = new Circle();*/
		Square greenSquare = new Square();
		Triangle yellowTriangle = new Triangle();
		
		redCircle.color = "red";
		redCircle.draw();
		System.out.println("----------------------");
/*		blueCircle.color = "blue";
		blueCircle.draw();*/
		greenSquare.color = "green";
		greenSquare.draw();
		System.out.println("----------------------");
		
		
		yellowTriangle.color = "yellow";
		yellowTriangle.draw();
		System.out.println("----------------------");
		
	}
}
