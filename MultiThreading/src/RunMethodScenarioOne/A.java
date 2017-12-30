
// t.start()  method always call run()  no arg run method

package RunMethodScenarioOne;

public class A extends Thread {

	public void run() {
		System.out.println("no arg");
	}
public void run(int i) {
		System.out.println("int arg");
	}
	
}
