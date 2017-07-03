/*Create class VariableStack that can accept numbers more than its size. The size of the Stack will be 
specified  in  the  constructor.  If  the  number  of  integers  exceeds  the  size,  the  stack  should 
automatically grow to accommodate the new element.   */

package asst5_4;

public class VariableStack implements Stack{
	int toss;
	int stack[];
	// allocate and initialize stack 
	public VariableStack(int size) {
		stack=new int [size];
		toss=-1;
		
	}
	// Push an item onto the stack 
	public void push(int I) {
		if(toss==stack.length-1 )  // use length member 
		{
			int temp[]=new int[stack.length*2];
			for(int i=0; i<stack.length; i++) 
				temp[i] = stack[i]; 
			 stack = temp;       
			 stack[++toss] = I;    
			 }    
		      else     
		     stack[++toss] = I;  
		}  
	 
	// Pop an item from the stack 
	@Override
	  public int pop() { 
		if(toss < 0) {      
			System.out.println("VariableStack is underflow ");   
			return 0;     
			}     
		else       
		    return stack[toss--];
		}
	}