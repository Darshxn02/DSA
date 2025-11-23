class RemoveElementLinkedList {
    Node head; // head of list

    // Node class
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert at beginning
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Delete node at a given position
    void deleteAtPosition(int position) {
        // If list is empty
        if (head == null)
            return;

        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next;
            return;
        }

        // Find previous node of the node to delete
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If position is invalid
        if (temp == null || temp.next == null)
            return;

        // Node temp.next is the node to be deleted
        Node next = temp.next.next;

        temp.next = next; // unlink the deleted node
    }

    // Print the linked list
    void printList() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        RemoveElementLinkedList list = new RemoveElementLinkedList();

        // Creating linked list: 50 -> 40 -> 30 -> 20 -> 10
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        System.out.println("Before deletion:");
        list.printList();

        // Remove node at position 2 (0-based index)
        list.deleteAtPosition(2);

        System.out.println("After deleting node at position 2:");
        list.printList();
    }
}
