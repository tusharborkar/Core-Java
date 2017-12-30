package SleepMethod;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Run Thread " + i);
			try {
				MyThread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		MyThread m = new MyThread();
		m.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thraed " + i);
			try {
				m.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
