n = int(input("Enter n: "))

num = 1

for i in range(n):
    for j in range(n):
        print(num, end="")
        num += 1

        if num > 6:
            num = 1

    print()