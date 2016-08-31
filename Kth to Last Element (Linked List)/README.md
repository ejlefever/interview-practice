# Accessing a Linked List

## Design an algorithm that returns the kth to last element in a singly-linked list with only a pointer to the head.

### Method Header:
Java: public Node findKthFromLast(Node n, int k) {}

Ruby: def find_kth_from_last(node, k)

### Example:
Given a pointer to the head of the following linked list: 1 => 2 => 3 => 4 => 5 => 6

findKthFromLast(head, 2); //would return the node with value 4