class myQueue:

    # Constructor
    def __init__(self, cap):
        self.capacity = cap
        self.arr = [0] * self.capacity
        self.front = -1
        self.rear = -1

    # Enqueue operation
    def enqueue(self, x):
        if self.isFull():
            print("Queue Overflow")
            return

        if self.front == -1:
            self.front = 0

        self.rear += 1
        self.arr[self.rear] = x

    # Dequeue operation
    def dequeue(self):
        if self.isEmpty():
            print("Queue Underflow")
            return -1

        val = self.arr[self.front]
        self.front += 1

        if self.front > self.rear:
            self.front = -1
            self.rear = -1

        return val

    # Peek operation
    def peek(self):
        if self.isEmpty():
            print("Queue is Empty")
            return -1

        return self.arr[self.front]

    # Check if queue is empty
    def isEmpty(self):
        return self.front == -1

    # Check if queue is full
    def isFull(self):
        return self.rear == self.capacity - 1


# Main program
if __name__ == "__main__":

    capacity = int(input("Enter the capacity of the queue: "))
    q = myQueue(capacity)

    while True:

        print("\n--- Queue Menu ---")
        print("1. Enqueue")
        print("2. Dequeue")
        print("3. Peek")
        print("4. Check if Empty")
        print("5. Check if Full")
        print("6. Exit")

        choice = int(input("Enter your choice: "))

        match choice:

            case 1:
                x = int(input("Enter value to enqueue: "))
                q.enqueue(x)

            case 2:
                print("Dequeued:", q.dequeue())

            case 3:
                print("Front element:", q.peek())

            case 4:
                print("Is queue empty:",
                      "Yes" if q.isEmpty() else "No")

            case 5:
                print("Is queue full:",
                      "Yes" if q.isFull() else "No")

            case 6:
                print("Exiting...")
                break

            case _:
                print("Invalid choice! Please try again.")