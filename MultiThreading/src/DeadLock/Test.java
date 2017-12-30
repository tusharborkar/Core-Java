package DeadLock;

public class Test {

	public static void main(String[] args) {

		MyThread1 m1 = new MyThread1();
		

		MyThread2 m2 = new MyThread2();
		m1.start();
		m2.start();

	}

}
