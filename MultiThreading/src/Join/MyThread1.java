package Join;

public class MyThread1 {
	public void name() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("1st thread" + i);

				}

			}
		});
		t1.start();
	

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("2nd thread" + i);
				}

			}
		});t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("3rd thread" + i);
				}

			}
		});t3.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		MyThread1 m = new MyThread1();
		m.name();

	}

}