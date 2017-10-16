package java_20170921_ScoreUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ScoreUI extends Frame{
	//FIELD
	Panel p1, p2, p3;
	Label title, labName, labKor, labEng, labMath;
	TextArea ta;
/*	static TextField tfName, tfKor, tfEng, tfMath;
	static String name, kor, eng, math;*/ //STATIC에 올려버리먼 Garbage Collector가 없기에 나중 프로그램이 커지면 문제가 생길 수 있음.
	TextField tfName, tfKor, tfEng, tfMath;
	String name, kor, eng, math;
	Button btn1, btn2, btn3, btn4;
	//CONSTRUCTOR
	public ScoreUI() {
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		p1.setLayout(new GridLayout(4,2));
		p3.setLayout(new BorderLayout());
		
		title = new Label("Enter score");
		title.setBackground(Color.cyan);
		labName = new Label("Name: ");
		labKor = new Label("Korean: ");
		labEng = new Label("English: ");
		labMath = new Label("Math: ");
		tfName = new TextField(20); //20글자가 들어감.
		tfKor = new TextField(20);
		tfEng = new TextField(20);
		tfMath = new TextField(20);
		btn1 = new Button("Save");
		btn2 = new Button("Print");
		btn3 = new Button("Close");
		ta = new TextArea(20,30);
		
		p1.add(labName); p1.add(tfName);
		p1.add(labKor); p1.add(tfKor);
		p1.add(labEng); p1.add(tfEng);
		p1.add(labMath); p1.add(tfMath);
		
		p2.add(btn1);	p2.add(btn2);	p2.add(btn3);
		
		p3.add(ta,BorderLayout.CENTER);
		p3.add(p2, BorderLayout.NORTH);

		
		
		add(title,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		setSize(300,500);
		setVisible(true);
		
		ScoreEvent event = new ScoreEvent(this);
		//윈도우 종료 이벤트 처리
		addWindowListener(event);
		
		//저장, 출력, 종료버튼 이벤트 처리
		btn1.addActionListener(event);
		btn2.addActionListener(event);
		btn3.addActionListener(event);
		
	}
	//METHOD

	
}
