// 707. Design Linked List
// Solved
// Medium
// Topics
// Companies
// Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
// A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
// If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

// Implement the MyLinkedList class:

// MyLinkedList() Initializes the MyLinkedList object.
// int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
// void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
// void addAtTail(int val) Append a node of value val as the last element of the linked list.
// void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
// void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.


// Example 1:

// Input
// ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
// [[], [1], [3], [1, 2], [1], [1], [1]]
// Output
// [null, null, null, null, 2, null, 3]

// Explanation
// MyLinkedList myLinkedList = new MyLinkedList();
// myLinkedList.addAtHead(1);
// myLinkedList.addAtTail(3);
// myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
// myLinkedList.get(1);              // return 2
// myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
// myLinkedList.get(1);              // return 3


// Constraints:

// 0 <= index, val <= 1000
// Please do not use the built-in LinkedList library.
// At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex and deleteAtIndex.
// Seen this question in a real interview before?
// 1/4
// Yes
// No
// Accepted
// 305.1K
// Submissions
// 1.1M
// Acceptance Rate
// 28.0%

public class MyLinkedList
{

    int size;
    Node head;

    public MyLinkedList()
    {
        head = null;
        size = 0;
    }

    public int Get(int index)
    {
        if (index < 0 || index >= size) return -1;
        int i = 0;
        Node current = head;
        while (i < index) { current = current.next; i++; }

        return current.val;
    }

    public void AddAtHead(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void AddAtTail(int val)
    {
        if (size == 0) { AddAtHead(val); return; }
        Node current = head;
        while (current.next != null) current = current.next;

        Node newNode = new Node(val);
        current.next = newNode;
        size++;
    }

    public void AddAtIndex(int index, int val)
    {
        if (index < 0 || index > size) return;
        if (index == 0) { AddAtHead(val); return; }
        if (index == size) { AddAtTail(val); return; }

        int i = 0;
        Node current = head;
        while (i < index - 1) { current = current.next; i++; }

        Node newNode = new Node(val);
        Node next = current.next;
        current.next = newNode;
        newNode.next = next;
        size++;
    }

    public void DeleteAtIndex(int index)
    {
        if (index < 0 || index >= size) return;

        int i = 0;
        Node current = head;
        Node prev = null;
        size--;
        while (i < index)
        {
            prev = current;
            current = current.next;
            i++;
        }

        if (prev == null)
        {
            head = head.next;
            return;
        }

        Node next = current.next;
        prev.next = next;
    }

    public class Node
    {
        public Node next;
        public int val;

        public Node(int value)
        {
            this.val = value;
            next = null;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.Get(index);
 * obj.AddAtHead(val);
 * obj.AddAtTail(val);
 * obj.AddAtIndex(index,val);
 * obj.DeleteAtIndex(index);
 */