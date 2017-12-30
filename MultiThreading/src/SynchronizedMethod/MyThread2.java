package SynchronizedMethod;

public class MyThread2 extends Thread {

	A a;

	public MyThread2(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.show(100);
	}
}
