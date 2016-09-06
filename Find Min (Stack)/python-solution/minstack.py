from node import Node

class MinStack(object):
  def __init__(self):
    self.top = None

  def pop(self):
    if self.top == None:
      raise SystemExit("Empty Stack")
    item = self.top.data
    self.top = self.top.next
    return item

  def push(self, data):
    new_top = None
    if self.top == None or data < self.top.data:
      new_top = Node(data)
    else:
      new_top = Node(self.top.data)
    new_top.next = self.top
    self.top = new_top

  def peek(self):
    if self.top == None:
      raise SystemExit("Empty Stack - MinStack Empty, can't peek")
    else:
      return self.top.data