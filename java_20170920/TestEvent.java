package java_20170920;
import java.awt.*;
import java.awt.event.*;
public class TestEvent extends WindowAdapter implements ActionListener{
	public void windowClosing(WindowEvent we) {
		System.out.println("TestEvent Ŭ������ �޼ҵ� ȣ��");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent ae) {
		System.out.println("TestEvent Ŭ������ �޼ҵ� ȣ��. ��ư�� Ŭ���ƽ��ϴ�.");
		TestUI.name = TestUI.tfName.getText();
		System.out.println(TestUI.name);
	}
}
