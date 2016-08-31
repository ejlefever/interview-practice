public class kthFromLast {

	public static void main(String[] args) {

		//An example of how it works
		Node a = new Node(10);
		a.add(9);
		a.add(8);
		a.add(7);
		a.add(6);
		a.add(5);
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(0);

		Node b = findKthFromLast(a, 4); //expect 4
		System.out.println(b.getData());

	}

	public static Node findKthFromLast(Node n, int k) {

		if (n == null) {
			System.out.println("Invalid n.");
			return null;
		} else if (k > n.getNodeCount() || k < 0 || n == null) {
			System.out.println("Invalid k.");
			return null;
		}

		Node first = n;
		Node second = n;

		for (int i = 0; i < k; i++) {
			second = second.next;
		}

		while (second.next != null) {
			first = first.next;
			second = second.next;
		}

		return first;

	}

	public static class Node {

		Node next;
		private int data;
		private int nodeCount;

		public Node(int data) {
			this.data = data;
			this.nodeCount = 0;
		}

		public void add(int data) {
			Node temp = new Node(data);
			Node current = this;
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
			nodeCount++;
		}

		public int getNodeCount() {
			return nodeCount;
		}

		public int getData() {
			return data;
		}
	}

}