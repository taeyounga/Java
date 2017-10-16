package java_20170926;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadClass tc1 = new ThreadClass("April");
		ThreadClass tc2 = new ThreadClass("Benny");
		ThreadClass tc3 = new ThreadClass("Cecil");
		
/*		tc1.start();
		tc2.start();
		tc3.start();*/
		
/*		new Thread(tc1).start();
		new Thread(tc2).start();
		new Thread(tc3).start();*/
		
		Phone phone = new Phone();
		
		Thread th1 = new Thread(new ThreadClass("April", phone));
		Thread th2 = new Thread(new ThreadClass("Benny", phone));
		Thread th3 = new Thread(new ThreadClass("Cecil", phone));
		
/*		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
*/		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
