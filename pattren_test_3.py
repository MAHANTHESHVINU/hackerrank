n = int(input("Enter n: "))

number = 1
character = "a"

for i in range(n):
    for j in range(4):
        if j % 2 == 0:
            print(number, end="")
            number += 1
        else:
            print(character, end="")
            character = chr(ord(character) + 1)

    print()