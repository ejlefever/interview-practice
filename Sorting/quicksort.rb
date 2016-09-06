def quicksort(unsorted, low_index, high_index)
  low = low_index
  high = high_index
  pivot = (unsorted[low] + unsorted[high] + unsorted[(low + high)/2])/3

  while low <= high
    while unsorted[low] < pivot
      low += 1
    end
    while unsorted[high] > pivot
      high -= 1
    end
    if low <= high
      swap(unsorted, low, high)
      low += 1
      high -= 1
    end
  end

  if low_index < high
    quicksort(unsorted, low_index, high)
  end
  if low < high_index
    quicksort(unsorted, low, high_index)
  end
end

def swap(unsorted, i, j)
  temp = unsorted[i]
  unsorted[i] = unsorted[j]
  unsorted[j] = temp
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
quicksort(arr, 0, arr.length-1)
p arr