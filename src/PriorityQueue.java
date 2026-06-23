import java.util.Arrays;

class Item {
    int value;
    int priority;

    Item(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

public class PriorityQueue {
    Item[] pq;
    int size;

    PriorityQueue(int capacity) {
        pq = new Item[capacity];
        size = 0;
    }

    void enqueu(int value, int priority) {
        pq[size++] = new Item(value, priority);
    }

    // Function to get index of element with highest priority
    int peek() {
        if (size == 0) return -1;  // Handle empty queue

        int ind = 0;  // Start with first element
        int maxpriority = pq[0].priority;  // Start with first element's priority

        for (int i = 1; i < size; i++) {  // Start from 1
            // Update index if a higher priority is found
            if (pq[i].priority > maxpriority ||
                    (pq[i].priority == maxpriority && pq[i].value > pq[ind].value)) {
                maxpriority = pq[i].priority;
                ind = i;
            }
        }
        return ind;
    }

    // Function to remove the element with highest priority
    void dequeue() {
        int ind = peek();
        if (ind != -1) {
            pq[ind] = pq[size - 1];
            size--;
        }
    }

    public static void main(String[] args) {
        PriorityQueue PQ = new PriorityQueue(10);
        PQ.enqueu(10, 0);
        PQ.enqueu(20, 1);
        PQ.enqueu(30, 2);
        PQ.enqueu(40, 3);
        PQ.enqueu(50, 4);

        System.out.println(PQ.pq[PQ.peek()].value);  // 50 (highest priority)
        PQ.dequeue();

        System.out.println(PQ.pq[PQ.peek()].value);  // 40
        PQ.dequeue();

        System.out.println(PQ.pq[PQ.peek()].value);  // 30
        PQ.dequeue();

        System.out.println(PQ.pq[PQ.peek()].value);  // 20
        // PQ.dequeue();

        // System.out.println(PQ.pq[PQ.peek()].value);  // Would crash!
    }
}