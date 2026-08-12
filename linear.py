def linear_search(arr, target):
    count = 0

    for index, value in enumerate(arr):
        count += 1

        if value == target:
            return index, count

    return -1, count


arr = list(map(int, input("Enter elements: ").split()))
target = int(input("Enter element to search: "))

index, count = linear_search(arr, target)

if index != -1:
    print("Element found")
    print("Position:", index + 1)
    print("Numbers checked:", count)
else:
    print("Element not found")
    print("Numbers checked:", count)