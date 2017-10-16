package java_20170926;

public class FamilyRunnableTest {
	public static void main(String[] args) {
		Thread father = new Thread(new FamilyRunnable("Father"));
		Thread mother = new Thread(new FamilyRunnable("Mother"));
		Thread son = new Thread(new FamilyRunnable("Son"));
		
		father.start();
		mother.start();
		son.start();
		
		//Above, OR below. both works.
		
		FamilyRunnable father2 = new FamilyRunnable("Father2");
		FamilyRunnable mother2 = new FamilyRunnable("Mother2");
		FamilyRunnable son2 = new FamilyRunnable("Son2");
		
		new Thread(father2).start();
		new Thread(mother2).start();
		new Thread(son2).start();
	}
}
