public class DeleteNode {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    static Node delete(Node head, int value) {
        if (head == null) return null;

        if (head.data == value) return head.next;

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = delete(head, 20);
        print(head);
    }
}
