package java_20170921_MemberUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MemberUI extends Frame{
	//FIELD
	Panel p1, p2, p3;
	Label title, labName, labHeight, labWeight, labNational;
	TextArea ta;
	TextField tfName, tfHeight, tfWeight, tfNational;
	String name, kor, eng, math;
	Button btn1, btn2, btn3, btn4;
	//CONSTRUCTOR
	public MemberUI() {
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		p1.setLayout(new GridLayout(4,2));
		p3.setLayout(new BorderLayout());
		
		title = new Label("Enter score");
		title.setBackground(Color.cyan);
		labName = new Label("Name: ");
		labHeight = new Label("Height: ");
		labWeight = new Label("Weight: ");
		labNational = new Label("Nationality: ");
		tfName = new TextField(20); //20글자가 들어감.
		tfHeight = new TextField(20);
		tfWeight = new TextField(20);
		tfNational = new TextField(20);
		btn1 = new Button("Save");
		btn2 = new Button("Print");
		btn3 = new Button("Close");
		ta = new TextArea(20,30);
		
		p1.add(labName); p1.add(tfName);
		p1.add(labHeight); p1.add(tfHeight);
		p1.add(labWeight); p1.add(tfWeight);
		p1.add(labNational); p1.add(tfNational);
		
		p2.add(btn1);	p2.add(btn2);	p2.add(btn3);
		
		p3.add(ta,BorderLayout.CENTER);
		p3.add(p2, BorderLayout.NORTH);

		
		
		add(title,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		setSize(300,500);
		setVisible(true);
		
		MemberUIEvent event = new MemberUIEvent(this);
		//윈도우 종료 이벤트 처리
		addWindowListener(event);
		
		//저장, 출력, 종료버튼 이벤트 처리
		btn1.addActionListener(event);
		btn2.addActionListener(event);
		btn3.addActionListener(event);
		
	}
	//METHOD

	
}
