package java_20170919_scoreui;
import java.awt.*;
public class ScoreUI extends Frame{
	//FIELD
	
	//CONSTRUCTOR
	public ScoreUI() {
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		p2.setLayout(new GridLayout(4,2));
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		TextField tf4 = new TextField();
		Label title = new Label("점수입력 화면");
		Label lb1 = new Label("이름");
		Label lb2 = new Label("국어");
		Label lb3 = new Label("영어");
		Label lb4 = new Label("수학");
		Button btn = new Button("점수입력 종료");
		
		setTitle("첫번째 테스트");
		p1.add(title);
		p2.add(lb1);
		p2.add(tf1);
		p2.add(lb2);
		p2.add(tf2);
		p2.add(lb3);
		p2.add(tf3);
		p2.add(lb4);
		p2.add(tf4);
		p3.add(btn);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
	}
	//METHOD
}
