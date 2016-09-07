class Node

  attr_accessor :next
  attr_reader :data, :node_count

  def initialize(data)
    @data = data
    @node_count = 0
    @next = nil
  end

  def add(data)
    temp = Node.new(data)
    current = self
    while current.next != nil
      current = current.next
    end
    current.next = temp
    @node_count += 1
  end

  def print
    to_print = @data.to_s
    current = @next
    while current
      to_print += " => #{current.data}"
      current = current.next
    end
    puts to_print
  end

end

def reverse(head)

  previous = nil
  nextNode = nil
  current = head
  while current
    nextNode = current.next
    current.next = previous
    previous = current
    current = nextNode
  end
  previous

end

#Driver code
n = Node.new(10)
n.add(9)
n.add(8)
n.add(7)
n.add(6)
n.add(5)
n.add(4)
n.add(3)
n.add(2)
n.add(1)
n.add(0)
puts "Original list:"
n.print
puts "Reversed:"
reversed = reverse(n)
reversed.print