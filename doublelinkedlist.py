class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None

    # Insert at beginning
    def insertBeginning(self, data):
        newNode = Node(data)
        newNode.next = self.head
        self.head = newNode

    # Insert at end
    def insertEnd(self, data):
        newNode = Node(data)

        if self.head is None:
            self.head = newNode
            return

        temp = self.head

        while temp.next is not None:
            temp = temp.next

        temp.next = newNode

    # Insert at a specific position
    def insertPosition(self, data, position):
        if position < 1:
            print("Invalid position!")
            return

        if position == 1:
            self.insertBeginning(data)
            return

        newNode = Node(data)
        temp = self.head

        for i in range(1, position - 1):
            if temp is None:
                print("Position out of range!")
                return
            temp = temp.next

        if temp is None:
            print("Position out of range!")
            return

        newNode.next = temp.next
        temp.next = newNode

    # Delete from beginning
    def deleteBeginning(self):
        if self.head is None:
            print("List is empty!")
            return

        self.head = self.head.next

    # Delete from end
    def deleteEnd(self):
        if self.head is None:
            print("List is empty!")
            return

        if self.head.next is None:
            self.head = None
            return

        temp = self.head

        while temp.next.next is not None:
            temp = temp.next

        temp.next = None

    # Delete a specific value
    def deleteValue(self, value):
        if self.head is None:
            print("List is empty!")
            return

        if self.head.data == value:
            self.head = self.head.next
            return

        temp = self.head

        while temp.next is not None:
            if temp.next.data == value:
                temp.next = temp.next.next
                return

            temp = temp.next

        print("Value not found!")

    # Search for an element
    def search(self, value):
        temp = self.head
        position = 1

        while temp is not None:
            if temp.data == value:
                return position

            temp = temp.next
            position += 1

        return -1

    # Display the linked list
    def display(self):
        if self.head is None:
            print("List is empty!")
            return

        temp = self.head

        while temp is not None:
            print(temp.data, end=" -> ")
            temp = temp.next

        print("NULL")


# Main program
if __name__ == "__main__":

    ll = SinglyLinkedList()

    while True:

        print("\n--- Singly Linked List Menu ---")
        print("1. Insert at Beginning")
        print("2. Insert at End")
        print("3. Insert at Position")
        print("4. Delete from Beginning")
        print("5. Delete from End")
        print("6. Delete a Value")
        print("7. Search")
        print("8. Display")
        print("9. Exit")

        choice = int(input("Enter your choice: "))

        match choice:

            case 1:
                x = int(input("Enter value: "))
                ll.insertBeginning(x)

            case 2:
                x = int(input("Enter value: "))
                ll.insertEnd(x)

            case 3:
                x = int(input("Enter value: "))
                position = int(input("Enter position: "))
                ll.insertPosition(x, position)

            case 4:
                ll.deleteBeginning()

            case 5:
                ll.deleteEnd()

            case 6:
                x = int(input("Enter value to delete: "))
                ll.deleteValue(x)

            case 7:
                x = int(input("Enter value to search: "))
                position = ll.search(x)

                if position == -1:
                    print("Value not found!")
                else:
                    print("Value found at position:", position)

            case 8:
                print("Linked List:")
                ll.display()

            case 9:
                print("Exiting...")
                break

            case _:
                print("Invalid choice! Please try again.")