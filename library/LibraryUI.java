package library;
import java.awt.*;
import java.awt.event.*;

public class LibraryUI extends Frame {
	//FIELD
	Panel p1, p2, p3;
	Label ptitle, labTitle, labAuthor, labPublisher, labPrice;
	TextArea ta;
	TextField tfTitle, tfAuthor, tfPublisher, tfPrice;
	String title, kor, eng, math;
	Button btn1, btn2, btn3, btn4;
	//CONSTRUCTOR
	public LibraryUI() {
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		p1.setLayout(new GridLayout(4,2));
		p3.setLayout(new BorderLayout());
		
		ptitle = new Label("���� ������ ��� �Ǵ� �˻��ϼ���");
		ptitle.setBackground(Color.cyan);
		labTitle = new Label("������: ");
		labAuthor = new Label("����: ");
		labPublisher = new Label("���ǻ�: ");
		labPrice = new Label("����: ");
		tfTitle = new TextField(20);
		tfAuthor = new TextField(20);
		tfPublisher = new TextField(20);
		tfPrice = new TextField(20);
		btn1 = new Button("���");
		btn2 = new Button("���");
		btn3 = new Button("����");
		btn4 = new Button("�����˻�");
		ta = new TextArea(20,30);
		
		p1.add(labTitle); p1.add(tfTitle);
		p1.add(labAuthor); p1.add(tfAuthor);
		p1.add(labPublisher); p1.add(tfPublisher);
		p1.add(labPrice); p1.add(tfPrice);
		
		p2.add(btn1);	p2.add(btn2);	p2.add(btn3);	p2.add(btn4);
		
		p3.add(ta,BorderLayout.CENTER);
		p3.add(p2, BorderLayout.NORTH);
		
		add(ptitle,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		setSize(300,500);
		setVisible(true);
		
		LibraryUIEvent event = new LibraryUIEvent(this);
		
		//������ ���� �̺�Ʈ ó��
		addWindowListener(event);
		
		//����, ���, �����ư �̺�Ʈ ó��
		btn1.addActionListener(event);
		btn2.addActionListener(event);
		btn3.addActionListener(event);
		btn4.addActionListener(event);
	}
	//METHOD
}