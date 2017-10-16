package java_20171010;
import java.net.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MultiChatClient extends Frame implements ActionListener, WindowListener{
	//FIELD
	Socket s;
	Scanner scan;
	DataOutputStream dos;
	TextArea output;
	TextField input;
	String id;
	
	//CONSTRUCTOR
	public MultiChatClient (String id) {
		try {
			this.id = id;
			output = new TextArea(20,30);
			input = new TextField(20);
			add(output, BorderLayout.CENTER);
			add(input, BorderLayout.SOUTH);
			setSize(300,400);
			setVisible(true);
			
			input.addActionListener(this);
			addWindowListener(this);
			
			s = new Socket("192.168.100.45", 7000);
			dos = new DataOutputStream(s.getOutputStream());
			ClientChatter cc = new ClientChatter(s, output); 
			cc.start();
			
			scan = new Scanner(System.in);
			System.out.print("Client 발신>");
			while(true) {
				dos.writeUTF(scan.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void windowActivated(WindowEvent e) {
	}
	public void windowClosed(WindowEvent e) {
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {
	}
	public void windowDeiconified(WindowEvent e) {
	}
	public void windowIconified(WindowEvent e) {
	}
	public void windowOpened(WindowEvent e) {
	}
	public void actionPerformed(ActionEvent ae) {
		try {
			String str = input.getText();
			if(str != null) {
				dos.writeUTF(id + ": "+str);
				input.setText("");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	//METHOD


}
class ClientChatter extends Thread{
	//FIELD
	DataInputStream dis;
	TextArea output;
	
	//CONSTRUCTOR
	public ClientChatter(Socket s, TextArea output){
		try{
			dis = new DataInputStream(s.getInputStream());
			this.output = output;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//METHOD
	public void run(){
		try{
			String str = dis.readUTF();
			
			while(str != null) {
/*				System.out.println("수신: " + str);
				System.out.print(">");*/
				output.append(str + "\n");
				str = dis.readUTF();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}