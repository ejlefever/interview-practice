def look_and_say(input):
  counter = 1
  answer = ""
  input = str(input)
  for i in range(1, len(input)):
    if input[i] == input[i - 1]:
      counter += 1
    else:
      answer += str(counter)
      answer += input[i-1]
      counter = 1
  last = len(input) - 1
  if input[last - 1] == input[last]:
    answer += str(counter)
    answer += input[last]
  return answer

# Tester code
print "Input: 244466666"
print "Look and say..."
print look_and_say(244466666) # expected: 123456

print "Input: 4443255522"
print "Look and say..."
print look_and_say(4443255522) # expected: 3413123522
