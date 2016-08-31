require_relative 'min_stack'
require_relative 'node'

class StackWithMin

  attr_reader :top

  def initialize
    @top = nil
    @min = MinStack.new
  end

  def pop
    if @top
      item = @top.data
      @top = @top.next
      @min.pop
      item
    else
      puts "Empty Stack"
    end
  end

  def push(data)
    new_top = Node.new(data)
    new_top.next = @top
    @top = new_top
    @min.push(data)
  end

  def peek
    if @top
      @top.data
    else
      puts "Empty Stack"
    end
  end

  def get_min
    @min.peek
  end

end

# driver/tester code
s = StackWithMin.new
s.push(5)
p "Expected: 5. Received: #{s.get_min}"
s.push(6)
p "Expected: 5. Received: #{s.get_min}"
s.push(3)
p "Expected: 3. Received: #{s.get_min}"
s.push(3)
p "Expected: 3. Received: #{s.get_min}"
s.pop
p "Expected: 3. Received: #{s.get_min}"
s.pop
p "Expected: 5. Received: #{s.get_min}"
s.push(4)
p "Expected: 4. Received: #{s.get_min}"
s.push(7)
p "Expected: 4. Received: #{s.get_min}"