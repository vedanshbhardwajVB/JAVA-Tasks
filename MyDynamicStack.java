
import java.util.Scanner;

class CustomException extends Exception {
	public CustomException (String s){
		super(s);
	}
}

public class MyDynamicStack{
private int stackSize;
private int[] stackArray;
private int top;
private int fixedSize;
 
 public MyDynamicStack(int size) {
    this.stackSize = size;
    this.stackArray = new int[stackSize];
    this.top = -1;
    this.fixedSize=4*size;
}
 
public void push(int entry) throws CustomException{
    if(this.isStackFull()){
    	System.out.println("Stack Overflow, but optimising space...");
 	this.increaseStackCapacity();
	}
System.out.println("Adding: "+entry);
stackArray[++top]=entry;
}
 
public int pop() throws CustomException{
    if(this.isStackEmpty()){
    	//System.out.println("Stack underflow.");
	throw new CustomException("Nothing to pop , STACK UNDERFLOW");
	}
	int entry = this.stackArray[top--];
	System.out.println("Removed entry: "+entry);
	if(top+1 == stackSize/2){
	System.out.println("Reducing stack space for optimizing...");
	this.decreaseStackCapacity();
		}
		
	return entry;
}
 
public int peek() {
    return stackArray[top];
}
 
public boolean isStackEmpty() {
    return (top == -1);
}
 
public boolean isStackFull() throws CustomException{
	if(top+1 >= fixedSize) throw new CustomException("STACK OVERFLOW can not optimize further ! Sorry");
    return (top >= stackSize - 1);
}

private void increaseStackCapacity(){	         
    int[] newStack = new int[this.stackSize*2];
    for(int i=0;i<stackSize;i++){
        newStack[i] = this.stackArray[i];
    }
    this.stackArray = newStack;
    this.stackSize = this.stackSize*2;
}
 
private void decreaseStackCapacity(){	         
    int[] newStack = new int[this.stackSize/2];
    for(int i=0;i<stackSize/2;i++){
        newStack[i] = this.stackArray[i];
    }
    this.stackArray = newStack;
    this.stackSize = this.stackSize/2;
}
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the initial stack size, the dynamic stack can increase upto 4 times of this");
	int n = sc.nextInt();
	MyDynamicStack stack = new MyDynamicStack(n);
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