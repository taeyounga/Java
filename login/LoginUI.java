package login;

import java.awt.*;
import javax.swing.*;

public class LoginUI extends Frame {
	//Field
		Panel p,p_btn;
		Label title, labId, labPass;
		JTextField tfId;
		JPasswordField tfPass;	
		Button btnLogin, btnCancel, btnJoin;
		
		
		//Constructor
		public LoginUI(){
			p = new Panel();
			p_btn = new Panel();
			p.setLayout(new GridLayout(2,2));
			
			title = new Label("로그인 화면");
			title.setBackground(Color.cyan);
			
			labId = new Label("아이디 : ");
			labPass = new Label("패스워드 : ");
			
			tfId = new JTextField(25);
			tfPass = new JPasswordField(25);
						
			btnLogin = new Button("로그인");
			btnCancel = new Button("취소");
			btnJoin = new Button("회원가입");

			p_btn.add(btnLogin);
			p_btn.add(btnCancel);
			p_btn.add(btnJoin);
			
			p.add(labId);	p.add(tfId);
			p.add(labPass);	p.add(tfPass);
			
			add(title,BorderLayout.NORTH);
			add(p, BorderLayout.CENTER);
			add(p_btn, BorderLayout.SOUTH);
			
			setLocation(600,300);
			setSize(300,150);
			setVisible(true);	
			
			
			LoginEvent event = new LoginEvent(this);
			
			addWindowListener(event);
			btnLogin.addActionListener(event);
			btnCancel.addActionListener(event);
			btnJoin.addActionListener(event);
		
		}
}












