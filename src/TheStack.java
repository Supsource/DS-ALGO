import java.util.Arrays;

public class TheStack {
	
	private String[] stackArray;
	
	private int stackSize;
	
	private int topOfStack = -1;
	
	public TheStack(int size) {
		stackSize = size;
		stackArray = new String[size];
		
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input) {
		if(topOfStack + 1 < stackSize) {
			topOfStack++;
			stackArray[topOfStack]= input;
		
		}
		
		else System.out.println("Sorry but the Stack is full");
		displayTheStack();
		
		System.out.println("PUSH " + input + " Was added to the Stack");
	}

	private void displayTheStack() {
		// TODO Auto-generated method stub
		
	}
	
	
	public String pop() {
		if(topOfStack >= 0) {
			displayTheStack();
			
			System.out.println("POP " + stackArray[topOfStack] + " Was removed from the Stack\n");
			
			stackArray[topOfStack] = "-1";
			
			return stackArray[topOfStack--];
		} else {
			displayTheStack();
			
			System.out.println("Sorry but the stack is empty");
			
			return "-1";
		}
	}
	
	
       public String peek() {
    	   displayTheStack();
    	   
    	   System.out.println("PEEK " + stackArray[topOfStack] + " Is at top of the Stack\n");
    	   
    	   return stackArray[topOfStack];
       }
	
	
	public static void main(String[] args) {
		
		
		TheStack theStack = new TheStack(10);
		
		theStack.push("10");
		theStack.push("15");
		
		theStack.peek();  
		
		theStack.pop();
		
		theStack.displayTheStack();
		
	}

}
