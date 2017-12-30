package SynchronizedMethod;

public class Test {

	public static void main(String[] args) {

		
		A a = new A();
		MyThread1 m1 = new MyThread1(a);

		MyThread2 m2 = new MyThread2(a);
		m1.start();
		m2.start();

	}
}
