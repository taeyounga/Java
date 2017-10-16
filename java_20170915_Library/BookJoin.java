package java_20170915_Library;
import java.util.*;
public class BookJoin {
	//FIELD
	BookVO vo = null; //null vo��ü ����
	Vector<BookVO> list = new Vector<BookVO>(); //vo��ü�� ���� ArrayList ����
	//CONSTRUCTOR
	//METHOD
	//method - getter
	public BookVO getBookVO(){
		return vo;
	}
	//method - setter
	public void setBookVO(BookVO vo){
		this.vo = vo;
	}
	//method - ����Ʈ�� å ���� �����ϴ� �޼ҵ� ���� , let it be addBook
	//BookVO�� ���ڰ��� ���� �⺻�����ڿ�
	public void addBook(){
		list.add(vo);
	}
	//BookVO�� ���ڝ��� �ִ� �⺻�����ڿ�
	public void addBook(BookVO vo){
		list.add(vo);
	}
	//����Ʈ ��� ��� - �� ����� ���� List�� �� ���� ������ �����ϰ� ����. �� ���� BookVO vo�� �������.
	public void showList(){
		System.out.println("****************�������*******************");
		System.out.println("��ȣ\t����\t����\t���ǻ�\t����");
		System.out.println("----------------------------------------");
		for(int i=0;i<list.size();i++){
			BookVO vo = list.get(i);
			System.out.println((i+1) +"\t"+vo.getTitle() +"\t"+vo.getAuthor() +"\t"+ vo.getPublisher() +"\t"+ vo.getPrice());
		}
	}
}
