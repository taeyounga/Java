package java_20170926;

public class Phone {

	synchronized public void calling(String name) {
		for(int i=0;i<1000;i++) {
			System.out.println(name + " is on the line");
		}
	}
	
}
