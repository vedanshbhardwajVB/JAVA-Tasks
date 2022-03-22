import java.util.Scanner;

class CustomException extends Exception {
	public CustomException (String s){
		super(s);
	}
}
 
public class MyStack{
private int stackSize;
private int[] stackArray;
private int top;
 
 public MyStack(int size) {
    this.stackSize = size;
    this.stackArray = new int[stackSize];
    this.top = -1;
}
 
public void push(int entry) throws CustomException {
    if(this.isStackFull()){
    	//System.out.println("Stack Overflow");
	throw new CustomException("No space to push, STACK OVERFLOW !!");
	}
else{
	stackArray[++top]=entry;
	System.out.println("Entered entry: "+entry);
}

}
 
public int pop() throws CustomException {
    if(this.isStackEmpty()){
    	//System.out.println("Stack underflow.");
	throw new CustomException("No element to pop, STACK UNDERFLOW !!");
	
	}
	int entry = this.stackArray[top--];
	System.out.println("Removed entry: "+entry);
	return entry;
}
 
public int peek() {
    return stackArray[top];
}
 
public boolean isStackEmpty() {
    return (top == -1);
}
 
public boolean isStackFull() {
    return (top >= stackSize - 1);
}

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the stack size");
	int n = sc.nextInt();
	MyStack stack = new MyStack(n);
	try {
	boolean cont=true;
	while(cont){
	System.out.println("Press 1 for PUSHING, 2 for POPPING");
	int choice = sc.nextInt();
	if(choice == 1){
		System.out.println("How many elements do you want to push in the stack ?");
		int count = sc.nextInt();
		System.out.println("Start entering, one number in a line....");
		for(int i=0; i<count ;i++){
			stack.push(sc.nextInt());
			}
		}
	else {
		System.out.println("How many elements do you want to pop from the stack ?");
		int count = sc.nextInt();
		while (count >0){
			stack.pop();
			count--;
			}
		}
	
	System.out.println("Want to continue ?? 1 for YES, 2 for NO ");
	cont=sc.nextInt()==1? true: false;
	}

	} catch (CustomException e) {
		e.printStackTrace();
	}
}
}