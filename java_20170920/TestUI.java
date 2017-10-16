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
		addWindowListener(tEvent);*/ //TestEvent ��ü�� �ѱ�
		
/*		addWindowListener(this);*/ //�ڽ��� ó��
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("Anonymous Ŭ������ �̺�Ʈ ó��");
				System.exit(0);
			}
		});
		
		/*��ư �̺�Ʈ ó��. ��ư �̺�Ʈ�� TestUI �ڽ��� ó��*/
		//btnSave.addActionListener(this);
		
		/*��ư �̺�Ʈ�� TextEvent ��ü�� �Ѱܼ� ó��*/
		TestEvent bEvent = new TestEvent();
		btnSave.addActionListener(bEvent);
		
		/*��ư �̺�Ʈ�� anonymous Ŭ������ ó��*/
/*		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				System.out.println("Anonymous �̺�Ʈ�� ó��");
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
		System.out.println("this���� ��ư�� Ŭ���ƽ��ϴ�.");
		name = tfName.getText();
		System.out.println(name);
		
	}
	
}
