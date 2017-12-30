package SetGetName;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("hello" + i);
		}
	}

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
		System.out.println(t.currentThread().getName());

	}
}
