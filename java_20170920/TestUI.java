package java_20170920;
import java.awt.*;
import java.awt.event.*;
public class TestUI extends Frame implements WindowListener, ActionListener{
	//FIELD
	Panel p;
	Label title, labName;
	static TextField tfName;
	Button btnSave;
	static String name;
	
	//CONSTRUCTOR
	public TestUI() {
		p = new Panel();
		title = new Label("Save name");
		labName = new Label("Name: ");
		tfName = new TextField(20);
		btnSave = new Button("Save");
		p.add(labName);
		p.add(tfName);
		

		
		add(title,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		add(btnSave,BorderLayout.SOUTH);
		
		setSize(300, 200);
		setVisible(true);
		
/*		TestEvent tEvent = new TestEvent();
		addWindowListener(tEvent);*/ //TestEvent 객체에 넘김
		
/*		addWindowListener(this);*/ //자신이 처리
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("Anonymous 클래스로 이벤트 처리");
				System.exit(0);
			}
		});
		
		/*버튼 이벤트 처리. 버튼 이벤트를 TestUI 자신이 처리*/
		//btnSave.addActionListener(this);
		
		/*버튼 이벤트를 TextEvent 객체에 넘겨서 처리*/
		TestEvent bEvent = new TestEvent();
		btnSave.addActionListener(bEvent);
		
		/*버튼 이벤트를 anonymous 클래스로 처리*/
/*		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				System.out.println("Anonymous 이벤트로 처리");
			}
		});*/
		
	}
	
	
	//METHOD
	public void windowActivated(WindowEvent e) {}	
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("Exit!");
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("this에서 버튼이 클릭됐습니다.");
		name = tfName.getText();
		System.out.println(name);
		
	}
	
}
