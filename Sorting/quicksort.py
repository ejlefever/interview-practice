import random

def quicksort(unsorted, low_index, high_index):
  low = low_index
  high = high_index
  pivot = (unsorted[low] + unsorted[high] + unsorted[(low + high)/2])/3
  while low <= high:
    while unsorted[low] < pivot:
      low += 1
    while unsorted[high] > pivot:
      high -= 1
    if low <= high:
      swap(unsorted, low, high)
      low += 1
      high -= 1
  if low_index < high:
    quicksort(unsorted, low_index, high)
  if low < high_index:
    quicksort(unsorted, low, high_index)

def swap(unsorted, i, j):
  temp = unsorted[i]
  unsorted[i] = unsorted[j]
  unsorted[j] = temp

def generate_random_ints():
  ints = []
  for x in range(0, 10):
    ints.append(random.randint(0,9))
  return ints

random_ints = generate_random_ints()
print random_ints
print "Sorting..."
quicksort(random_ints, 0, len(random_ints)-1)
print random_ints