import java.util.Scanner;

class Node {
    private int data;
    private Node next;

    public Node() { this.data = 0; this.next = null; }
    public Node(int val) { this.data = val; this.next = null; }
    public int getdata() { return data; }
    public Node getnext() { return next; }
    public void setnext(Node next) { this.next = next; }
}

class oneway_circular {
    private Node head, tail, x, pre_x;
    private int loc;

    public oneway_circular() {
        head = new Node();
        x = tail = pre_x = head;
        loc = 0;
    }

    private void reset() { x = head.getnext(); pre_x = head; loc = 0; }
    private void move() { pre_x = x; x = x.getnext(); loc++; }

    public void append(int val) {
        Node n = new Node(val);
        if (head.getnext() == null) head.setnext(n);
        else tail.setnext(n);
        tail = n;
        n.setnext(head);
        System.out.println("Appended");
    }

    public boolean search(int val) {
        reset();
        while (x != head) {
            if (x.getdata() == val) {
                System.out.println("Found at " + loc);
                return true;
            }
            move();
        }
        System.out.println("Not found");
        return false;
    }

    public void delete(int val) {
        if (search(val)) {
            pre_x.setnext(x.getnext());
            if (x == tail) tail = pre_x;
            System.out.println("Deleted");
        }
    }

    public void display() {
        if (head.getnext() == null || head.getnext() == head) {
            System.out.println("Empty");
            return;
        }
        reset();
        while (x != head) {
            System.out.print(x.getdata() + " ");
            move();
        }
        System.out.println();
    }

    public void insert_after(int d1, int d2) {
        if (search(d2)) {
            Node nn = new Node(d1);
            nn.setnext(x.getnext());
            x.setnext(nn);
            if (x == tail) tail = nn;
            System.out.println("Inserted");
        }
    }

    // Exercise 1: Check if circular
    public boolean isCircular() {
        if (head.getnext() == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.getnext() != null) {
            slow = slow.getnext();
            fast = fast.getnext().getnext();
            if (slow == fast) return true;
        }
        return false;
    }

    // Exercise 2: Remove odd entries
    public void removeOddEntries() {
        if (head.getnext() == null || head.getnext() == head) return;
        Node curr = head.getnext(), prev = head, start = curr;
        while (true) {
            if (curr.getdata() % 2 != 0) {
                prev.setnext(curr.getnext());
                if (curr == tail) tail = prev;
                curr = prev.getnext();
            } else {
                prev = curr;
                curr = curr.getnext();
            }
            if (curr == start || curr == head) break;
        }
        if (head.getnext() == head) head.setnext(null);
        System.out.println("Odd entries removed");
    }

    // Homework: Split into two non-circular lists
    public oneway_circular[] split() {
        oneway_circular[] result = {new oneway_circular(), new oneway_circular()};
        if (head.getnext() == null || head.getnext() == head) return result;

        int size = 0;
        Node curr = head.getnext();
        while (curr != head) { size++; curr = curr.getnext(); }

        int half = size / 2;
        curr = head.getnext();
        for (int i = 0; i < half; i++) {
            result[0].append(curr.getdata());
            curr = curr.getnext();
        }
        while (curr != head) {
            result[1].append(curr.getdata());
            curr = curr.getnext();
        }
        return result;
    }
}

public class LinkedList_Homework {
    public static void main(String[] args) {
        oneway_circular list = new oneway_circular();
        Scanner sc = new Scanner(System.in);
        int opt, val;

        System.out.println("=== CIRCULAR LINKED LIST WITH HOMEWORK ===");

        do {
            System.out.println("\n0.Append 1.Insert 2.Delete 3.Search 4.Display");
            System.out.println("5.Circular? 6.RemoveOdd 7.Split 8.Quit");
            System.out.print("Choice: ");
            opt = sc.nextInt();

            switch (opt) {
                case 0:
                    System.out.print("Enter value: ");
                    list.append(sc.nextInt());
                    break;
                case 1:
                    System.out.print("Insert: ");
                    val = sc.nextInt();
                    System.out.print("After which: ");
                    list.insert_after(val, sc.nextInt());
                    break;
                case 2:
                    System.out.print("Delete: ");
                    list.delete(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Search: ");
                    list.search(sc.nextInt());
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Circular? " + list.isCircular());
                    break;
                case 6:
                    list.removeOddEntries();
                    System.out.print("After removal: ");
                    list.display();
                    break;
                case 7:
                    oneway_circular[] parts = list.split();
                    System.out.print("First half: "); parts[0].display();
                    System.out.print("Second half: "); parts[1].display();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (opt != 8);
        sc.close();
    }
}
