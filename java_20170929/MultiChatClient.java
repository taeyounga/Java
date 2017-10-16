package java_20170929;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
public class MultiChatClient extends Frame implements Runnable, ActionListener{
	//FIELD
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	TextField tf;
	TextArea ta;
	Label title;
	//CONSTRUCTOR
public MultiChatClient() {
	try {
		s = new Socket("192.168.100.45",7000);
		dis = new DataInputStream(s.getInputStream());
		dos = new DataOutputStream(s.getOutputStream());
		tf = new TextField(20);
		ta = new TextArea(20,20);
		title = new Label("Chat");
		add(title, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		setSize(300,300);
		setVisible(true);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
	
	//METHOD
public void run() {
	try {
		while(true) {
			//수신
			byte[] b = new byte[10000];
			if(dis.read(b) != -1) {
				ta.append("\n" + new String(b));
				System.out.println("echo: " + new String(b));
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}

}

@Override
public void actionPerformed(ActionEvent ae) {
	//송신
	try {
		String msg = tf.getText();
		dos.write(msg.getBytes());
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
}
