class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def add_last(self, data):
        new_node = Node(data)

        
        if self.head is None:
            self.head = new_node
            return

        
        current = self.head
        while current.next is not None:
            current = current.next

        
        current.next = new_node

    def display(self):
        current = self.head
        while current is not None:
            print(current.data, end=" -> ")
            current = current.next
        print("None")


ll = LinkedList()

ll.add_last(10)
ll.add_last(20)
ll.add_last(30)
ll.add_last(40)

ll.display()