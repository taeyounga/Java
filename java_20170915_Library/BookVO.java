package java_20170915_Library;

public class BookVO {
	//FIELD
	String title, author, publisher;
	int price;
	//CONSTRUCTOR
	public BookVO(){} //�⺻������
	public BookVO(String title, String author, String publisher, int price){ //�޼ҵ� �����ε�
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	//METHOD
	//method - getter
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public String getPublisher(){
		return publisher;
	}
	public int getPrice(){
		return price;
	}
	//method - setter
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	public void setPrice(int price){
		this.price = price;
	}
}
