package LinkedList.Basic;
public class FindMid {
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Head and Tail
    public static Node head;
    public static Node tail;
    // Insert at start
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Insert at end
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // Display linked list
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Find middle node
    public static Node findMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Main method
    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        addLast(30);
        addLast(40);
        addLast(50);
        System.out.println("Linked List:");
        display();
        Node mid = findMid();
        if (mid != null) {
            System.out.println("Middle Node: " + mid.data);
        } else {
            System.out.println("Linked List is empty");
        }
    }
}
