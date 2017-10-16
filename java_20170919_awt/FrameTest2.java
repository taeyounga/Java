package java_20170919_awt;
import java.awt.*;
public class FrameTest2 {
	public static void main(String[] args) {
		Frame f = new Frame("프레임테스트2");
		Panel p = new Panel();
		Button btn1 = new Button("Button1");
		Button btn2 = new Button("Button2");
		
		p.add(btn1);
		p.add(btn2);
		
//		f.add(p, BorderLayout.SOUTH);
		
		f.setSize(300,300);
		f.setVisible(true);
	}
}
