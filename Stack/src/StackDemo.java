import controller.Stack;
import handler.IOHandler;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		IOHandler ioHandler = new IOHandler();
		
		while(true) {
			int value = ioHandler.inputInt();
			
			stack.push(value);
			
			ioHandler.printString(stack.toString());
		}
		
	}
}
