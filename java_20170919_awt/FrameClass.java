package java_20170919_awt;
import java.awt.*;
public class FrameClass extends Frame{
	//FIELD
	//CONSTRUCTOR
	public FrameClass() {
		Panel p = new Panel();
		Button btn1 = new Button("��ư1");
		
		setTitle("FrameClass ����");
		p.add(btn1);
		
		add(p);
		setSize(400, 400);
		setVisible(true);
	}
	//METHOD
}
