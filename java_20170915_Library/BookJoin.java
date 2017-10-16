package java_20170915_Library;
import java.util.*;
public class BookJoin {
	//FIELD
	BookVO vo = null; //null vo객체 생성
	Vector<BookVO> list = new Vector<BookVO>(); //vo객체가 들어가는 ArrayList 생성
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
	//method - 리스트에 책 정보 저장하는 메소드 생성 , let it be addBook
	//BookVO의 인자값이 없는 기본생성자용
	public void addBook(){
		list.add(vo);
	}
	//BookVO의 인자앖이 있는 기본생성자용
	public void addBook(BookVO vo){
		list.add(vo);
	}
	//리스트 출력 기능 - 위 기능을 통해 List의 각 값은 정보를 저장하고 있음. 이 값을 BookVO vo에 덮어씌우자.
	public void showList(){
		System.out.println("****************도서목록*******************");
		System.out.println("번호\t제목\t저자\t출판사\t가격");
		System.out.println("----------------------------------------");
		for(int i=0;i<list.size();i++){
			BookVO vo = list.get(i);
			System.out.println((i+1) +"\t"+vo.getTitle() +"\t"+vo.getAuthor() +"\t"+ vo.getPublisher() +"\t"+ vo.getPrice());
		}
	}
}
