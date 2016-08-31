require_relative 'node'

class MinStack

  attr_accessor :top

  def initialize
    @top = nil
  end

  def pop
    if @top
      item = @top.data
      @top = @top.next
      return item
    else
      puts "Empty Stack"
    end
  end

  def push(data)
    new_top = nil
    if !@top || data < @top.data
      new_top = Node.new(data)
    else
      new_top = Node.new(@top.data)
    end
    new_top.next = @top
    @top = new_top
  end

  def peek
    if top
      @top.data
    else
      puts "Empty Stack"
    end
  end

end