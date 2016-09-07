public class ReverseLinkedList {

  public static void main(String[] args) {

    Node list = new Node(0);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    printLinkedList(list);
    Node newList = reverse(list);
    printLinkedList(newList);

  }

  public static Node reverse(Node head) {

    Node previous = null;
    Node nextNode = null;
    Node current = head;

    while(current != null) {
        nextNode = current.next;
        current.next = previous;
        previous = current;
        current = nextNode;
    }

    return previous;

  }

  public static void printLinkedList(Node head) {

    Node current = head;
    while (current != null) {
      System.out.print(current.getData() + " ");
      current = current.next;
    }
    System.out.println();

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