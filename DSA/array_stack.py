class myStack:
    # Constructor
    def __init__(self, cap):
        self.capacity = cap
        self.arr = [0] * self.capacity
        self.top = -1

    # Push operation
    def push(self, x):
        if self.isFull():
            print("Stack Overflow")
            return

        self.top += 1
        self.arr[self.top] = x

    # Pop operation
    def pop(self):
        if self.isEmpty():
            print("Stack Underflow")
            return -1

        val = self.arr[self.top]
        self.top -= 1
        return val

    # Peek operation
    def peek(self):
        if self.isEmpty():
            print("Stack is Empty")
            return -1

        return self.arr[self.top]

    # Check if stack is empty
    def isEmpty(self):
        return self.top == -1

    # Check if stack is full
    def isFull(self):
        return self.top == self.capacity - 1


# Main program
if __name__ == "__main__":

    capacity = int(input("Enter the capacity of the stack: "))
    st = myStack(capacity)

    while True:

        print("\n--- Stack Menu ---")
        print("1. Push")
        print("2. Pop")
        print("3. Peek")
        print("4. Check if Empty")
        print("5. Check if Full")
        print("6. Exit")

        choice = int(input("Enter your choice: "))

        match choice:

            case 1:
                x = int(input("Enter value to push: "))
                st.push(x)

            case 2:
                print("Popped:", st.pop())

            case 3:
                print("Top element:", st.peek())

            case 4:
                print("Is stack empty:",
                      "Yes" if st.isEmpty() else "No")

            case 5:
                print("Is stack full:",
                      "Yes" if st.isFull() else "No")

            case 6:
                print("Exiting...")
                break

            case _:
                print("Invalid choice! Please try again.")