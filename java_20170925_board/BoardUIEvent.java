package java_20170925_board;
import java.awt.event.*;
import java.util.*;
public class BoardUIEvent extends WindowAdapter implements ActionListener{
	//FIELD
	BoardUI ui;
	String title, password, body;
	ArrayList<BoardVO> list = new ArrayList<BoardVO>();
	
	//CONSTRUCTOR
	public BoardUIEvent() {}
	public BoardUIEvent(BoardUI ui) {
		this.ui = ui;
	}

	//METHOD
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String action = ae.getActionCommand();
		if(action.equals("저장")) {
			title = ui.tfTitle.getText();
			password = ui.tfPass.getText();
			body = ui.taContent.getText();
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setPassword(password);
			vo.setBody(body);
			list.add(vo);
			ui.tfTitle.setText("");
			ui.tfPass.setText("");
			ui.taContent.setText("");
		}if(action.equals("출력")) {
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i).getTitle() + "\t");
				System.out.print(list.get(i).getPassword() + "\t");
				System.out.println(list.get(i).getBody());
			}
		}if(action.equals("종료")) {
			System.exit(0);
		}
	}
	

}
