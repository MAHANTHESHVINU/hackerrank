n = int(input("Enter n: "))

for i in range(1, n + 1):
    for j in range(i):
        if i % 2 == 1:
            print(i, end="")
        else:
            print(chr(96 + i), end="")
    print()