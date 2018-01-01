import java.util.Stack;

public class DecToBin {

	private int remainder;
	private Stack<Integer> binary;
	
	public void decimalToBinary(int val) {
		binary = new Stack<Integer>();
		while(val > 0) {			
			remainder = val % 2;
			val /= 2;
			binary.push(remainder);			
		}
		while(!binary.isEmpty()) {
			System.out.print(binary.pop());
		}
	}	
		
	
	public static void main(String[] args) {
		DecToBin obj = new DecToBin();
		obj.decimalToBinary(20);

	}

}
