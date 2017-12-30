package Yield;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		Thread.yield();
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread start" + i);
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		MyThread m = new MyThread();
		Thread t1 = new Thread(m);
		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main thread start");
		}

	}

}
