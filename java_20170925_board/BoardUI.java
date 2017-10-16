package java_20170925_board;

import java.awt.*;

import java_20170921_MemberUI.MemberUIEvent;

public class BoardUI extends Frame {
	//Field
		Panel p, p_title, p_pass, p_content,p_btn;
		Label title, labTitle, labPass, labContent;
		TextField tfTitle, tfPass;
		TextArea taContent;
		Button btnSave, btnList, btnExit;
		
		
		//Constructor
		public BoardUI(){
			p = new Panel();
			p_title = new Panel();
			p_pass = new Panel();
			p_content = new Panel();
			p_btn = new Panel();
			p.setLayout(new GridLayout(4,1));
			
			title = new Label("�Խ���");
			title.setBackground(Color.cyan);
			
			labTitle = new Label("���� : ");
			labPass = new Label("�н����� : ");
			labContent = new Label("���� :");
			
			tfTitle = new TextField(33);
			tfPass = new TextField(30);
			taContent = new TextArea(20,50);
			
			btnSave = new Button("����");
			btnList = new Button("���");
			btnExit = new Button("����");
			
			p_title.add(labTitle);
			p_title.add(tfTitle);
			p_pass.add(labPass);
			p_pass.add(tfPass);
			p_content.add(labContent);
			p_btn.add(btnSave);
			p_btn.add(btnList);
			p_btn.add(btnExit);
			
			p.add(title);
			p.add(p_title);
			p.add(p_pass);
			p.add(p_content);
			
			add(p,BorderLayout.NORTH);
			add(taContent, BorderLayout.CENTER);
			add(p_btn, BorderLayout.SOUTH);
			
			setSize(350,400);
			setVisible(true);	
			
			BoardUIEvent event = new BoardUIEvent(this);
			//������ ���� �̺�Ʈ ó��
			addWindowListener(event);
			
			//����, ���, �����ư �̺�Ʈ ó��
			btnSave.addActionListener(event);
			btnList.addActionListener(event);
			btnExit.addActionListener(event);

		}
}
