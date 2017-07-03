/*Make a program that checks the implementation of FixedStack & VariableStack the classes.  */ 

package asst5_4;

public class StackDemo {
public static void main(String[] args) {
	
	 FixedStack fs1 = new FixedStack(0); 
	 FixedStack fs2 = new FixedStack(8);  
	// push some numbers onto the stack      
	 for(int i=0; i<5; i++) fs1.push(i);     
	 for(int i=0; i<8; i++) fs2.push(i); 
	// pop those numbers off the Fixed stack 
    System.out.println("\n********Stack in Fixedstack1:******");   
	 for(int i=0; i<5; i++)       
		 System.out.println(fs1.pop());  
	    System.out.println("\n*******Stack in Fixedstack2:*******");   
	    for(int i=0; i<8; i++)       
	    	System.out.println(fs2.pop());   
	    
	 // pop those numbers off the Variable stack 
	    VariableStack v1=new VariableStack(5);
	    VariableStack v2=new VariableStack(7);
	    	    
	    for(int i=0; i<10; i++) v1.push(i);    
	    for(int i=0; i<15; i++) v2.push(i);  
	    System.out.println("\n*****Stack in Variablestack1:*******");   
	    for(int i=0; i<10; i++)        
	    	System.out.println(v1.pop());  
	    System.out.println("\n*******Stack in Variablestack2:********");   
	    for(int i=0; i<15; i++)       
	    	System.out.println(v2.pop());   
	    }
}