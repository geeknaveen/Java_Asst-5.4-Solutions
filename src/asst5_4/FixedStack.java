/*Create Class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified 
in the constructor. If the number of integers exceeds the size, “Stack overflow” message should 
be displayed.   
*/
package asst5_4;

public class FixedStack implements  Stack{
int stack [];
int toss;
//allocate and initialize stack 
public FixedStack(int size) {
stack=new int[size];
toss--;

}
//Push an item onto the stack 
	@Override
	public void push(int I) {
if(toss==stack.length-1)   // use length member 
	System.out.println("Stack Overflow");
else 
	stack[++toss]=I;
		
	}
	// Pop an item from the stack 
	@Override
	public int pop() {
	if(toss<0){
		System.out.println("FixedStack is underflow");
	
		return 0;
	
	}
	else {
		return stack[toss--];
	
	}
	
}
}