n = int(input("Enter n: "))

num = 1

for i in range(0, n):
    c ='a'
    for j in range(4):
        if i==0 or i==2:
            print(num, end="")
            num += 1
        else:
            print(chr(ord(c) + j), end="")
    print()