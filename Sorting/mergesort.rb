def mergesort(unsorted, low_index, high_index)
  if low_index < high_index
    mid = low_index + (high_index - low_index)/2
    mergesort(unsorted, low_index, mid)
    mergesort(unsorted, mid + 1, high_index)
    merge(unsorted, low_index, mid, high_index)
  end
end

def merge(unsorted, low_index, mid, high_index)
  original = unsorted.dup
  a = low_index
  b = mid + 1
  z = low_index
  while a <= mid and b <= high_index
    if original[a] <= original[b]
      unsorted[z] = original[a]
      a += 1
    else
      unsorted[z] = original[b]
      b += 1
    end
    z += 1
  end
  while a <= mid
    unsorted[z] = original[a]
    a += 1
    z += 1
  end
  while b <= mid
    unsorted[z] = original[b]
    b += 1
    z += 1
  end
end

def generate_random
  ints = []
  10.times do
    ints << rand(10)
  end
  ints
end

arr = generate_random
p arr
puts "Sorting..."
mergesort(arr, 0, arr.length-1)
p arr