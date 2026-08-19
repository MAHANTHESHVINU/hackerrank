arr = list(map(int, input("Enter array elements: ").split()))

odd = []
even = []

for i in range(len(arr)):
    if (i & 1)  == 1:
        even.append(arr[i])
    else:
        odd.append(arr[i])

print("Odd position elements:", odd)
print("Even position elements:", even)

# Sort the arrays
odd.sort()
even.sort()

second_smallest_odd = odd[1]
second_largest_even = even[-2]

result = second_smallest_odd + second_largest_even

print("Second smallest in odd positions:", second_smallest_odd)
print("Second largest in even positions:", second_largest_even)
print("Sum:", result)