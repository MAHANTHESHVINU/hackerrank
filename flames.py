name1 = input("Enter first name: ").lower().replace(" ", "")
name2 = input("Enter second name: ").lower().replace(" ", "")

# Convert names to lists
a = list(name1)
b = list(name2)

# Remove common characters
for ch in a[:]:
    if ch in b:
        a.remove(ch)
        b.remove(ch)

# Count remaining characters
count = len(a) + len(b)

# FLAMES
flames = ["F", "L", "A", "M", "E", "S"]

while len(flames) > 1:
    index = (count % len(flames)) - 1

    if index >= 0:
        flames = flames[index + 1:] + flames[:index]
    else:
        flames = flames[:index]

result = flames[0]

if result == "F":
    print("Friends")
elif result == "L":
    print("Love")
elif result == "A":
    print("Affection")
elif result == "M":
    print("Marriage")
elif result == "E":
    print("Enemies")
elif result == "S":
    print("Siblings")