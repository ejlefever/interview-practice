import random

def mergesort(unsorted, low_index, high_index):
  if low_index < high_index:
    mid = low_index + (high_index - low_index)/2
    mergesort(unsorted, low_index, mid)
    mergesort(unsorted, mid + 1, high_index)
    merge(unsorted, low_index, mid, high_index)

def merge(unsorted, low_index, mid, high_index):
  original = list(unsorted)
  a = low_index
  b = mid + 1
  z = low_index
  while a <= mid and b <= high_index:
    if original[a] <= original[b]:
      unsorted[z] = original[a]
      a += 1
    else:
      unsorted[z] = original[b]
      b += 1
    z += 1
  while a <= mid:
    unsorted[z] = original[a]
    a += 1
    z += 1
  while b <= mid:
    unsorted[z] = original[b]
    b += 1
    z += 1

def generate_random_ints():
  ints = []
  for x in range(0, 10):
    ints.append(random.randint(0,9))
  return ints

random_ints = generate_random_ints()
print random_ints
print "Sorting..."
mergesort(random_ints, 0, len(random_ints)-1)
print random_ints