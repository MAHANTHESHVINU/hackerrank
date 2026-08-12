def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    count = 0

    while low <= high:
        mid = (low + high) // 2
        count += 1

        if arr[mid] == target:
            return mid, count

        elif arr[mid] < target:
            low = mid + 1

        else:
            high = mid - 1

    return -1, count


arr = list(map(int, input("Enter sorted elements: ").split()))
target = int(input("Enter element to search: "))

index, count = binary_search(arr, target)

if index != -1:
    print("Element found")
    print("Position:", index + 1)
    print("Numbers checked:", count)
else:
    print("Element not found")
    print("Numbers checked:", count)