package java_20170925_board;

public class BoardVO {
	//FIELD
	String title, password, body;
	//CONSTRUCTOR
	public BoardVO() {}
	public BoardVO(String title, String password, String body) {
		this.title = title;
		this.password = password;
		this.body = body;
	}
	//METHOD
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	

}
