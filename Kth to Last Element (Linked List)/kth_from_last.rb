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

end

def find_kth_from_last(node, k)
  #handling edge cases
  if node == nil
    puts "Invalid node"
    return nil
  elsif !k || k > node.node_count || k < 0
    puts "Invalid k"
    return nil
  end

  first = node
  second = node

  k.times { second = second.next }

  while second.next
    first = first.next
    second = second.next
  end

  first

end

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
kth_to_last = find_kth_from_last(n, 4)
p kth_to_last.data #expect 4
kth_to_last = find_kth_from_last(n, 2)
p kth_to_last.data #expect 2