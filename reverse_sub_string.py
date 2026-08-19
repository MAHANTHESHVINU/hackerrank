arr = list(map(int, input("Enter array elements: ").split()))

k = int(input("Enter subgroup size: "))

n = len(arr)

for i in range(0, n, k):
    left = i
    right = min(i + k - 1, n - 1)

    while left < right:
        arr[left], arr[right] = arr[right], arr[left]

        left += 1
        right -= 1

print("Array after reversing subgroups:", arr)