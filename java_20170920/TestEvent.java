package java_20170920;
import java.awt.*;
import java.awt.event.*;
public class TestEvent extends WindowAdapter implements ActionListener{
	public void windowClosing(WindowEvent we) {
		System.out.println("TestEvent 클래스의 메소드 호출");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent ae) {
		System.out.println("TestEvent 클래스의 메소드 호출. 버튼이 클릭됐습니다.");
		TestUI.name = TestUI.tfName.getText();
		System.out.println(TestUI.name);
	}
}
