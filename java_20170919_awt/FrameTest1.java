package java_20170919_awt;
import java.awt.*;
public class FrameTest1 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("첫번째 프레임 테스트");
		f.setLayout(new FlowLayout());
		Button btn1 = new Button("버튼1");
		
		f.add(btn1);
		
/*		f.add(btn1, BorderLayout.NORTH);
		f.add(btn1, BorderLayout.SOUTH);
		f.add(btn1, BorderLayout.WEST);
		f.add(btn1, BorderLayout.EAST);
		f.add(btn1, BorderLayout.CENTER);*/
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
