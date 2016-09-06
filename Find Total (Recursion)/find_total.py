def find_total(n):
  if n < 1:
    return -1 #edge case
  else:
    if n == 1:
      return 1 #base case
    else:
      return n + find_total(n-1)

#driver code
print find_total(5)
print find_total(4)
print find_total(3)
print find_total(2)
print find_total(1)
print find_total(0)