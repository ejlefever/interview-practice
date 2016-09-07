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

  def print_list(self):
    to_print = str(self.data)
    current = self.next
    while current:
      to_print += " => " + str(current.data)
      current = current.next
    print to_print

def reverse(head):
  previous = None
  next = None
  current = head
  while current:
    next = current.next
    current.next = previous
    previous = current
    current = next
  return previous

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
head.print_list()
reversed = reverse(head)
reversed.print_list()
