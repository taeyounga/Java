//프레임을 상속받는 형태
package java_20170919_awt;
import java.awt.*;
public class FrameTest3 extends Frame{
	public FrameTest3() {}
	public FrameTest3(String title) {
		super(title);
		System.out.println("FrameTest3에서 호출되는 생성자");
	}
	
	
	public static void main(String[] args) {
		//FIELD
		//CONSTRUCTOR
		
		
		//METHOD
		FrameTest3 ft3 = new FrameTest3();
		Panel p = new Panel();
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		p.add(btn1);
		p.add(btn2);
				
		ft3.setTitle("FrameTest3실행");
		ft3.add(p,BorderLayout.NORTH);		
		ft3.setSize(300,300);
		ft3.setVisible(true);
	}
}