import java.lang.Thread;
public class ThreadDemoOne extends Thread {
	public static void main(String[] args) {
		ThreadDemoOne thread = new ThreadDemoOne();
		thread.start();
		System.out.println("This code is outside of the thread");
  }
  	public void run() {
		System.out.println("This code is running in a thread");
  }
}