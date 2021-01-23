package prime;

import java.util.Stack;
public class MaxStack {

	private Stack<Integer> stack;
	private Stack<Integer> maxStack;
	
    public MaxStack() {
    	this.stack = new Stack<>();
    	this.maxStack = new Stack<>();
    }


    public void push(int x) {
    	stack.push(x);
    	if(maxStack.isEmpty() || maxStack.peek() <= x)
    		maxStack.push(x);
    }
    
  
    public int pop() {
    	if(stack.isEmpty())
    		throw new NullPointerException();
    	int x = stack.pop();
    	if(maxStack.peek() == x)
    		maxStack.pop();
    	
    	return x;
    }


    public int peekMax() {
       if(maxStack.isEmpty())
    	   	throw new NullPointerException();
       return maxStack.peek();
    }

   
    public int popMax() {
    	if(maxStack.isEmpty())
    		throw new NullPointerException();
    	
    	Stack<Integer> temp = new Stack<>();
    	int max = maxStack.pop();
    	while(stack.peek() != max)
    		temp.push(stack.pop());
    	
    	stack.pop();
    	while(!temp.isEmpty())
    		push(temp.pop());
    	
    	return max;
    }
}
