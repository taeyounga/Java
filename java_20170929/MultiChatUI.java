package java_20170929;
import java.awt.*;
public class MultiChatUI extends Frame{
	//FIELD
	Label title;
	Panel p1, p2, p3;
	TextArea ta;
	TextField tf;
	Button btn;

	//CONSTRUCTOR
public MultiChatUI() {
	title = new Label("Chat UI");
	p1.add(title);
	p2.add(ta);
	p3.add(tf);	p3.add(btn);
	add(p1,BorderLayout.NORTH);
	add(p2,BorderLayout.CENTER);
	add(p3,BorderLayout.SOUTH);
	setSize(300,500);
	setVisible(true);
}

	//METHOD


}
