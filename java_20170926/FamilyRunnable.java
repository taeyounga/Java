package java_20170926;

public class FamilyRunnable implements Runnable {
	//FIELD
	String name;
	
	//CONSTRUCTOR
	public FamilyRunnable() {}
	public FamilyRunnable(String name) {
		this.name = name;
	}
	//METHOD
	public void run() {
		for(int i=0;i<100;i++) {
				sleeping();
		}
	}
	public void sleeping() {
		System.out.println(name + " is sleeping");
	}
}
