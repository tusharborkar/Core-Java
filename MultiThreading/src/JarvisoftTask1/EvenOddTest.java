package JarvisoftTask1;

public class EvenOddTest {

	public static void main(String[] args) {
		Even e = new Even();
		Thread t1 = new Thread(e);
		t1.start();

		Odd o = new Odd();
		Thread t2 = new Thread(o);
		t2.start();
		
	
		

	}
}
