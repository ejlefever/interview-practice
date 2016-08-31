import java.util.*;

public class StackWithMin {

	public Node top;
	public MinStack min;

	public StackWithMin() {
		top = null;
		min = new MinStack();
	}

	public int pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		int item = top.getData();
		top = top.getNext();
		min.pop();
		return item;
	}

	public void push(int data) {
		Node newTop = new Node(data);
		newTop.setNext(top);
		top = newTop;
		min.push(data);
	}

	public int peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.getData();
	}

	public int getMin() {
		return min.peek();
	}

}