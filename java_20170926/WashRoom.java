package java_20170926;

public class WashRoom {

	synchronized public void openDoor(String name) {
		System.out.println(name + " entered.");
		for(int i=0;i<1000;i++) {
			System.out.println(name + " is using.");
		}
		System.out.println(name + " finished using.");
	}
}
