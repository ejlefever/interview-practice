from minstack import MinStack
from node import Node

class StackWithMin(object):
  def __init__(self):
    self.top = None
    self.min = MinStack()

  def pop(self):
    if self.top == None:
      raise SystemExit("Empty Stack")
    item = self.top.data
    self.top = self.top.next
    self.min.pop()
    return item

  def push(self, data):
    new_top = Node(data)
    new_top.next = self.top
    self.top = new_top
    self.min.push(data)

  def peek(self):
    if self.top == None:
      raise SystemExit("Empty Stack")
    else:
      return self.top.data

  def get_min(self):
    return self.min.peek()

#tester code
s = StackWithMin()
s.push(5)
print "Expected 5:"
print s.get_min()
s.push(6)
print "Expected 5:"
print s.get_min()
s.push(3)
print "Expected 3:"
print s.get_min()
s.pop()
print "Expected 5:"
print s.get_min()
s.push(4)
print "Expected 4:"
print s.get_min()
s.push(7)
print "Expected 4:"
print s.get_min()