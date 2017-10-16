package java_20170926;

public class FamilyThread extends Thread {
	//FIELD
	String name;
	WashRoom wr;
	
	//CONSTRUCTOR
	public FamilyThread() {}
	public FamilyThread(String name) {
		this.name = name;
	}
	public FamilyThread(String name, WashRoom wr) {
		this.name = name;
		this.wr = wr;
	}
	
	//METHOD
	public void run() {
/*		for(int i=0;i<100;i++) {
			sleeping();
		}*/
		wr.openDoor(name);
	}
		
	public void sleeping() {
		System.out.println(name + " is sleeping");
	}
	
	
}
