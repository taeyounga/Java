//�������� ��ӹ޴� ����
package java_20170919_awt;
import java.awt.*;
public class FrameTest3 extends Frame{
	public FrameTest3() {}
	public FrameTest3(String title) {
		super(title);
		System.out.println("FrameTest3���� ȣ��Ǵ� ������");
	}
	
	
	public static void main(String[] args) {
		//FIELD
		//CONSTRUCTOR
		
		
		//METHOD
		FrameTest3 ft3 = new FrameTest3();
		Panel p = new Panel();
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		p.add(btn1);
		p.add(btn2);
				
		ft3.setTitle("FrameTest3����");
		ft3.add(p,BorderLayout.NORTH);		
		ft3.setSize(300,300);
		ft3.setVisible(true);
	}
}