package JarvisoftTask1;

public class MyThread1  {

	public void m1() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i <= 10; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}

				}
				System.out.println("*************");
			}

		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					if (i % 2 == 1) {
						System.out.println(i);
					}

				}

			}
		});
		t2.start();

	}

	public static void main(String[] args) {
		MyThread1 m = new MyThread1();
		m.m1();

	}
}
