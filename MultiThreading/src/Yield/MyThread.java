package Yield;

public class MyThread extends Thread {

	public void run() {
		Thread.yield();
		for (int i = 0; i < 10; i++) {

			System.out.println("Child Thread");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
