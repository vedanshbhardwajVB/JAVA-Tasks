public class InterfaceDemo {
	public static void main(String [] args){
	MyDemo md = new MyDemo();
	md.abc();
	md.xyz();
	}
}

interface demo1 {
	void abc();
}


interface demo2 {
	void xyz();
}

class MyDemo implements demo1, demo2 {
public void abc()
{System.out.println("Inside abc function");}
public void xyz()
{System.out.println("Inside xyz function");}
}