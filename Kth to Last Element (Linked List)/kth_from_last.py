def find_kth_from_last(head, k):
  if head == None:
    print "Empty Linked List"
    return None
  elif k > head.node_count or k < 0:
    print "Invalid K"
    return None
  first = head
  second = head
  for i in range(0, k):
    second = second.next
  while second.next:
    first = first.next
    second = second.next
  return first

#linked list with minimum functionality
class Node(object):
  def __init__(self, data):
    self.data = data
    self.node_count = 0
    self.next = None

  def add(self, data):
    current = self
    while current.next:
      current = current.next
    current.next = Node(data)
    self.node_count += 1

#tester code
head = Node(10)
head.add(9)
head.add(8)
head.add(7)
head.add(6)
head.add(5)
head.add(4)
head.add(3)
head.add(2)
head.add(1)
head.add(0)
from_last = find_kth_from_last(head, 4)
print "Expected: 4"
print from_last.data
from_last = find_kth_from_last(head, 6)
print "Expected: 6"
print from_last.data