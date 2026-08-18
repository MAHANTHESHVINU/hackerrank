class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None


class DoublyLinkedList:
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
        new_node.prev = current

    def display(self):
        current = self.head

        while current is not None:
            print(current.data, end=" <-> ")
            current = current.next

        print("None")


dll = DoublyLinkedList()

dll.add_last(10)
dll.add_last(20)
dll.add_last(30)
dll.add_last(40)

dll.display()