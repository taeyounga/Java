package library;
import java.util.*;
import java.awt.event.*;
public class LibraryUIEvent extends WindowAdapter implements ActionListener {
	//FIELD
	LibraryUI ui;
	ArrayList<LibraryVO> list = Shelf.getList(); //Shelf�� list ȣ��
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
		if(action.equals("���")) {			//�����ư Ŭ��
			//LibraryVO��ü ����
			LibraryVO vo = new LibraryVO();
			vo.setTitle(ui.tfTitle.getText());
			vo.setAuthor(ui.tfAuthor.getText());
			vo.setPublisher(ui.tfPublisher.getText());
			vo.setPrice(Integer.parseInt(ui.tfPrice.getText())); //vo��ü�� price�� int�̱⿡ textfield�� ���� ������ ��ȯ.
			ui.tfTitle.setText("");
			ui.tfAuthor.setText("");
			ui.tfPublisher.setText("");
			ui.tfPrice.setText("");
			list.add(vo); //Shelf�� list��ü�� vo ����
		}
		else if(action.equals("���")) {		//��¹�ư Ŭ��
			strHeader = ("��ȣ\t������\t����\t���ǻ�\t����\n");
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
		else if(action.equals("����")) {		//�����ư Ŭ��
			System.exit(0);
		}
		else if(action.equals("�����˻�")) {	//�����˻���ư Ŭ��
			//�˻�
			strHeader = "������ ";
			strHeader += ui.tfTitle.getText();
			strHeader += "�� ���� �˻�����Դϴ�.\n";
			strHeader += ("��ȣ\t������\t����\t���ǻ�\t����\n");
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

