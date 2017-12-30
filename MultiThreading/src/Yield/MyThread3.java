package Yield;

public class MyThread3 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
		
			try {
				join(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child yield thread ====" + i);

		

		}

	}

	public static void main(String[] args) {

		MyThread3 t = new MyThread3();
		t.start();
		

		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread yield ======" + i);

		}

	}
}
