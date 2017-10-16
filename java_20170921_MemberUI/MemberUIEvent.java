package java_20170921_MemberUI;

import java.awt.event.*;

public class MemberUIEvent extends WindowAdapter implements ActionListener{
	
	//FIELD
	MemberUI ui;
	java.util.Vector<MemberVO>list = Member.getList();
	String name, height, weight, national, str;
	//CONSTRUCTOR

	public MemberUIEvent() {}
	public MemberUIEvent(MemberUI ui) {
		this.ui = ui;
	}

	//METHOD
	public void windowClosing(WindowEvent we) {
		System.out.println("[ScoreEvent] Close window");
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
		if(action.equals("Save")) {
			ui.ta.append("Save clicked\n");
			name = ui.tfName.getText();
			height = ui.tfHeight.getText();
			weight = ui.tfWeight.getText();
			national = ui.tfNational.getText();
			MemberVO vo = new MemberVO(name, Integer.parseInt(height), Integer.parseInt(weight), national);
			Member.getList().add(vo);
			ui.tfName.setText("");
			ui.tfHeight.setText("");
			ui.tfWeight.setText("");
			ui.tfNational.setText("");
			ui.ta.append("VO created\n");
		}if(action.equals("Print")) {

			for(int i=0;i<list.size();i++) {
				str = (list.get(i).getName() + "\t");
				str += (list.get(i).getHeight() + "\t");
				str += (list.get(i).getWeight() + "\t");
				str += (list.get(i).getNational() + "\n");
				ui.ta.append(str);
			}
		}if(action.equals("Close")) {
			System.exit(0);
		}
		// TODO Auto-generated method stub
		
	}

}
