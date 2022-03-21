public class ThreadDemoTwo {
	public static void main (String [] args){
		Runnable r = ()-> {System.out.println("Thread running via Runnable interface");};
		Thread t=new Thread(r);
		t.start();
		System.out.println("This line is outside any thread");
	}
}