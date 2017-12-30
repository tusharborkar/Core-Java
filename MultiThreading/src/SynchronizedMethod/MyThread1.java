package SynchronizedMethod;

public class MyThread1 extends Thread {

	A a ;
	public MyThread1(A a ) {
	
	this.a = a;
	}
	@Override
	public void run() {
		a.show(5);
	}
	
	
}
