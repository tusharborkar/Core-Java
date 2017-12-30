package Yield;

public class YieldThreadDemo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// yields control to another thread every 5 iterations
			if ((i % 5) == 0) {
				System.out.println(Thread.currentThread().getName()
						+ " yielding control...");

				/*
				 * causes the currently executing thread object to temporarily
				 * pause and allow other threads to execute
				 */
				Thread.yield();
			}
		}

		System.out.println(Thread.currentThread().getName()
				+ " has finished executing.");
	}

	public static void main(String[] args) {

		YieldThreadDemo t = new YieldThreadDemo();

		t.start();

		
		YieldThreadDemo t1 = new YieldThreadDemo();

		t1.start();
	}
}
