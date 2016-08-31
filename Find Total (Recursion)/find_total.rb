def find_total(n)
  if n < 1
    return -1 #edge case - must be at least 1!
  else
    if n == 1
      return 1 #base case
    else
      return n + find_total(n-1)
    end
  end
end

#Driver Code
p find_total(5)
p find_total(4)
p find_total(3)
p find_total(2)
p find_total(1)