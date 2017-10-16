package login;

import java.awt.event.*;
import java.util.*;
import java_20170921_MemberUI.*;

public class LoginEvent extends WindowAdapter 
							implements ActionListener{
	
	//Field
	MemberUI memberView;
	LoginUI loginView;
	static Hashtable<String,String> login 
							= new Hashtable<String, String>(); 
	
	//Constructor
	public LoginEvent(){}
	
	public LoginEvent(LoginUI loginView){
		this.loginView = loginView;
	}
	
	//Method
	public void actionPerformed(ActionEvent ae){
		String name = ae.getActionCommand();
		
		if(name.equals("회원가입")){
			
			//loginView.setVisible(false);
			memberView = new MemberUI();
		/*
			login.put("id", "admin");
			login.put("pass", "1234");			
			
			Enumeration<String> e = login.keys();
			while(e.hasMoreElements()){
				String key = e.nextElement();
				System.out.print(key + "\t");
				System.out.println(login.get(key));
			}			
		*/
			
		}else if(name.equals("로그인")){
			Enumeration<String> e = login.keys();
			boolean idCheck = false;
			boolean passCheck = false;
			
			while(e.hasMoreElements()){
				String key = e.nextElement();
				
				if(key.equals("id") 
						&& login.get(key).equals(loginView.tfId.getText())){
					//System.out.println("아이디 동일");
					idCheck = true;
				}
				
				if(key.equals("pass")
						&& login.get(key).equals(loginView.tfPass.getText())){
					//System.out.println("패스워드 동일");
					passCheck = true;
				}			
			}
			
			System.out.println("--------- 로그인 결과 -------------");
			if(idCheck && passCheck) System.out.println("로그인 성공");
			else	System.out.println("로그인 실패");
			
			
		}else if(name.equals("취소")){
			loginView.tfId.setText("");
			loginView.tfPass.setText("");			
		}
	}
	
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}










