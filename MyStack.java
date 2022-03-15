


public class MyStack{
private int stackSize;
private int[] stackArray;
private int top;
 
 public MyStack(int size) {
    this.stackSize = size;
    this.stackArray = new int[stackSize];
    this.top = -1;
}
 
public void push(int entry) throws Exception {
    if(this.isStackFull()){
    	System.out.println("Stack Overflow");
	}
else
stackArray[++top]=entry;
}
 
public int pop() throws Exception {
    if(this.isStackEmpty()){
    	System.out.println("Stack underflow.");
return -1;
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
	MyStack stack = new MyStack(3);
	try {
		for(int i=1;i<10;i++){
		    stack.push(i);
		}
		for(int i=1;i<5;i++){
			 stack.pop();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}