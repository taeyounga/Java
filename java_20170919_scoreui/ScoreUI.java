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
		Label title = new Label("�����Է� ȭ��");
		Label lb1 = new Label("�̸�");
		Label lb2 = new Label("����");
		Label lb3 = new Label("����");
		Label lb4 = new Label("����");
		Button btn = new Button("�����Է� ����");
		
		setTitle("ù��° �׽�Ʈ");
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
