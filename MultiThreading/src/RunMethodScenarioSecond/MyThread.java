

// if we havent declare run() in our program then thread class run() will call 
// it doesnt have implemntations

package RunMethodScenarioSecond;

public class MyThread extends Thread{

	public void run(int i) {
		System.out.println("int arg");
	}
}
