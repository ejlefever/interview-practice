def is_unique?(input)
  map = {}
  input = input.split("")
  input.each do |i|
    if map[i]
      return false
    else
      map[i] = 1
    end
  end
  true
end

puts "The string, 'burger' is unique:"
puts is_unique?("burger")
puts "The string, 'spinach' is unique:"
puts is_unique?("spinach")