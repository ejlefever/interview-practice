def look_and_say(input)
  counter = 1
  answer = ""
  input = input.to_s.split("")
  input.each_with_index do |i, index|
    if index > 0
      if i == input[index - 1]
        counter += 1
      else
        answer += counter.to_s + input[index-1]
        counter = 1
      end
    end
  end
  last = input.length - 1
  if input[last - 1] == input[last]
    answer += counter.to_s + input[last]
  end
  answer
end

# Tester code
puts "Input: 244466666"
puts "Look and say..."
puts look_and_say(244466666) # expected: 123456

puts "Input: 4443255522"
puts "Look and say..."
puts look_and_say(4443255522) # expected: 3413123522

puts "Input: 1"
puts "Look and say..."
puts look_and_say(1) # expected: 3413123522