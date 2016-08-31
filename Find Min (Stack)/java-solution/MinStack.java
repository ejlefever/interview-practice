import java.util.*;

public class MinStack {

	public Node top;

	public int pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		int item = top.getData();
		top = top.getNext();
		return item;
	}

	public void push(int data){
		Node newTop = null;
		if (top == null || data < top.getData()) {
			newTop = new Node(data);
		} else {
			newTop = new Node(top.getData());
		}
		newTop.setNext(top);
		top = newTop;
	}

	public int peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.getData();
	}

}