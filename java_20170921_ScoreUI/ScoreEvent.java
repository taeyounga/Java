package java_20170921_ScoreUI;
import java.awt.event.*;
import java.util.*;
import java_20170914.TranscriptVO;
public class ScoreEvent extends WindowAdapter implements ActionListener{
	
	//FIELD
	ScoreUI ui;
	ArrayList<ScoreVO> list = new ArrayList<ScoreVO>();
	String str, strHeader;
	
	//CONSTRUCTOR
	public ScoreEvent() {}
	public ScoreEvent(ScoreUI ui) {
		this.ui = ui;
		System.out.println();
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
			System.out.println("[ScoreEvent] Save clicked");
			
			ui.name = ui.tfName.getText();
			ui.tfName.setText("");
			ui.kor = ui.tfKor.getText();
			ui.tfKor.setText("");
			ui.eng = ui.tfEng.getText();
			ui.tfEng.setText("");
			ui.math = ui.tfMath.getText();
			ui.tfMath.setText("");
			
			//ScoreVO에 담기
			//Vector클래스를 list이름의 객체로 생성하여 ScoreVO 담기.
			ScoreVO vo = new ScoreVO(ui.name, Integer.parseInt(ui.kor), Integer.parseInt(ui.eng), Integer.parseInt(ui.math));
			list.add(vo);
			System.out.println("vo added. size = "+list.size());
			System.out.println("[ScoreEvent] Entry saved to static String at ScoreUI.class");
			
		}if(action.equals("Print")) {
			System.out.println("[ScoreEvent] Print clicked");
			strHeader = ("Row\tName\tKorean\tEnglish\tMath\tTotal\tAverage\n");
			strHeader += ("--------------------------------------------------------\n");
			ui.ta.append(strHeader);
			for(int i=0;i<list.size();i++) {
				str = ((i+1)+"\t");
				str += (list.get(i).getName()+"\t");
				str += (list.get(i).getKor()+"\t");
				str += (list.get(i).getEng()+"\t");
				str += (list.get(i).getMath()+"\t");
				str += (list.get(i).getTot()+"\t");
				str += (list.get(i).getAvg()+"\n");
				System.out.println(str);
				ui.ta.append(str);
			}
		}if(action.equals("Close")) {
			System.out.println("[ScoreEvent] Close clicked");
			System.exit(0);
		}
	}
	
}
