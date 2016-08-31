public class didThatWork {

	//driver/tester code
	public static void main(String[] args) {

		StackWithMin s = new StackWithMin();
		s.push(5);
		System.out.println("Expected: 5. Received: " + s.getMin());
		s.push(6);
		System.out.println("Expected: 5. Received: " + s.getMin());
		s.push(3);
		System.out.println("Expected: 3. Received: " + s.getMin());
		s.push(3);
		System.out.println("Expected: 3. Received: " + s.getMin());
		s.pop();
		System.out.println("Expected: 3. Received: " + s.getMin());
		s.pop();
		System.out.println("Expected: 5. Received: " + s.getMin());
		s.push(4);
		System.out.println("Expected: 4. Received: " + s.getMin());
		s.push(7);
		System.out.println("Expected: 4. Received: " + s.getMin());

	}

}