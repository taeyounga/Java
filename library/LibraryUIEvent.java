package library;
import java.util.*;
import java.awt.event.*;
public class LibraryUIEvent extends WindowAdapter implements ActionListener {
	//FIELD
	LibraryUI ui;
	ArrayList<LibraryVO> list = Shelf.getList(); //Shelf의 list 호출
	String str, strHeader, search;
	
	//CONSTRUCTOR
	public LibraryUIEvent() {}
	public LibraryUIEvent(LibraryUI ui) {
		this.ui = ui;
	}
	
	//METHOD
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
		if(action.equals("등록")) {			//저장버튼 클릭
			//LibraryVO객체 생성
			LibraryVO vo = new LibraryVO();
			vo.setTitle(ui.tfTitle.getText());
			vo.setAuthor(ui.tfAuthor.getText());
			vo.setPublisher(ui.tfPublisher.getText());
			vo.setPrice(Integer.parseInt(ui.tfPrice.getText())); //vo객체의 price는 int이기에 textfield의 값을 정수로 변환.
			ui.tfTitle.setText("");
			ui.tfAuthor.setText("");
			ui.tfPublisher.setText("");
			ui.tfPrice.setText("");
			list.add(vo); //Shelf의 list객체에 vo 투입
		}
		else if(action.equals("출력")) {		//출력버튼 클릭
			strHeader = ("번호\t도서명\t저자\t출판사\t가격\n");
			strHeader += ("-----------------------------------------\n");
			ui.ta.append(strHeader);
			
			for(int i=0;i<list.size();i++) {
				str = ((i+1)+"\t");
				str += (list.get(i).getTitle()+"\t");
				str += (list.get(i).getAuthor()+"\t");
				str += (list.get(i).getPublisher()+"\t");
				str += (list.get(i).getPrice()+"\n");
				ui.ta.append(str);
			}
		}
		else if(action.equals("종료")) {		//종료버튼 클릭
			System.exit(0);
		}
		else if(action.equals("도서검색")) {	//도서검색버튼 클릭
			//검색
			strHeader = "도서명 ";
			strHeader += ui.tfTitle.getText();
			strHeader += "에 대한 검색결과입니다.\n";
			strHeader += ("번호\t도서명\t저자\t출판사\t가격\n");
			strHeader += ("-----------------------------------------\n");
			ui.ta.append(strHeader);
			for(int i=0; i<list.size();i++){
				if(list.get(i).getTitle().contains(ui.tfTitle.getText())){
					search = ((i+1)+"\t");
					search += (list.get(i).getTitle()+"\t");
					search += (list.get(i).getAuthor()+"\t");
					search += (list.get(i).getPublisher()+"\t");
					search += (list.get(i).getPrice()+"\n");
					ui.ta.append(search);
				}
			}
		}
	}
}

