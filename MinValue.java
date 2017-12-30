import java.util.*;

public class MinValue {
	
	private Stack<Integer> stack;
	private Stack<Integer> stack2;
	
	public MinValue() {
		stack  = new Stack<Integer>();
	    stack2 = new Stack<Integer>();
	}
	
	
	public int getMin() {
		return stack2.peek();
	}
	
	public void push(int val) {
		if(stack2.isEmpty()) {
			stack.add(val);
			stack2.add(val);
		}else if(!stack2.isEmpty()){
			stack.add(val);
			if(val <= stack2.peek()) {
				stack2.add(val);
			}
		}	
	}
	
	public void pop() {
		if(stack.isEmpty()) {
			return;
		}else {
			if(stack.peek() == stack2.peek()) {				
				stack.remove(stack.size()-1);
				stack2.remove(stack2.size()-1);		
			}else {
				stack.remove(stack.size()-1);
			}
		}		
	}

	public static void main(String[] args) {
		
		MinValue min = new MinValue();
		Random r = new Random();
		min.push(r.nextInt(10));
		min.push(r.nextInt(10));
		min.push(r.nextInt(10));
		min.push(r.nextInt(10));
		min.push(r.nextInt(10));
		min.push(r.nextInt(10));
		min.push(r.nextInt(10));
		min.push(r.nextInt(10));
		
		//printing main stack content
		for (int i = min.stack.size() -1; i >=0; i--) {			
			System.out.println("| "+min.stack.get(i)+" |");	
		}		
		System.out.println(" ___");
		
		System.out.println();
		System.out.println();
		//printing minimum stack content
		for (int i = min.stack2.size() -1; i >=0; i--) {			
			System.out.println("| "+min.stack2.get(i)+" |");	
		}		
		System.out.println(" ___");
		
		min.pop();
		min.pop();
		min.pop();
		
		//printing both stacks contents again after popping 
		System.out.println();
		System.out.println("After popping");
		System.out.println();
		
		for (int i = min.stack.size() -1; i >=0; i--) {			
			System.out.println("| "+min.stack.get(i)+" |");	
		}		
		System.out.println(" ___");
		
		System.out.println();
		System.out.println();
		
		for (int i = min.stack2.size() -1; i >=0; i--) {			
			System.out.println("| "+min.stack2.get(i)+" |");	
		}		
		System.out.println(" ___");
		System.out.println();
		System.out.println("Current minimum value in the stack is: "+ min.getMin());
	}

}
