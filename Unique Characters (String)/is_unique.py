def is_unique(input):
  map = {}
  for i in range(0, len(input)):
    if map.has_key(input[i]):
      return False
    else:
      map[input[i]] = 1
  return True

print "The string, 'burger' is unique:"
print is_unique("burger")
print "The string, 'spinach' is unique:"
print is_unique("spinach")