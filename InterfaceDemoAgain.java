public class InterfaceDemoAgain {
	public static void main(String [] args){
	abcd interf = new abcd() {
	public void test(){
	System.out.println("Inside abcd interface function");
		}
	};
	interf.test();
}

interface abcd{
void test();
}
}