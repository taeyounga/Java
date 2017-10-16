package java_20170926;

public class FamilyThreadTest {

	public static void main(String[] args) {
		
		WashRoom wr = new WashRoom();
		
		FamilyThread father = new FamilyThread("Father", wr);
		FamilyThread mother = new FamilyThread("Mother", wr);
		FamilyThread son = new FamilyThread("Son", wr);

		father.start();
		mother.start();
		son.start();
	}
}
