package JarvisoftTask1;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {
				System.out.println("Hello" + i);
			}
			

		}

	}

	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2();
		t1.start();

		MyThread2 t2 = new MyThread2();
		t2.start();

	}

}
