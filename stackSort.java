package stack;

import java.util.*;

public class stackSort {

	public static void main(String[] args) {		
		
		Stack<Integer> stack  = new Stack<Integer>(); // main -unsorted- stack
		Stack<Integer> stack2 = new Stack<Integer>(); //sorted stack
		Random r = new Random();
		
		stack.push(r.nextInt(10));
		stack.push(r.nextInt(10));
		stack.push(r.nextInt(10));
		stack.push(r.nextInt(10));
		stack.push(r.nextInt(10));		
		
		//printing main stack content
		for (int i = stack.size() -1; i >=0; i--) {			
			System.out.println("| "+stack.get(i)+" |");	
		}		
		System.out.println(" ___");		
		
		//sorting functionality
		if(stack==null|| stack.isEmpty()) {
			System.out.println("what stack?!");
		}else {		
			while(!stack.isEmpty()) {
				
				int temp = stack.pop();				
				while(!stack2.isEmpty() && temp < stack2.peek()) {
					stack.push(stack2.pop());					
				}
				stack2.push(temp);
			}		
		}		
		
		//printing out sorted stack
		System.out.println();
		System.out.println();
		
		for (int i = stack2.size() -1; i >=0; i--) {			
			System.out.println("| "+stack2.get(i)+" |");			
		}
		System.out.println(" ___");
	}
}
