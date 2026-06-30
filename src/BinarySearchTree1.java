/**
 * Binary Search Tree Implementation
 * BST Property: Left < Parent < Right
 */
public class BinarySearchTree1 {
    // Inner class representing each node
    static class BSTNode {
        int data;
        BSTNode left;
        BSTNode right;

        public BSTNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private static BSTNode root;
    // Constructor - creates empty tree
    public BinarySearchTree1() {
        root = null;
    }
    /**
     * INSERT: Adds a new value to the tree
     * - If tree empty, new node becomes root
     * - Else, compare and go left (smaller) or right (larger)
     * - Insert where we find an empty spot
     */
    public void insert(int id) {
        BSTNode newNode = new BSTNode(id);

        // If tree is empty, make new node the root
        if (root == null) {
            root = newNode;
            return;
        }

        BSTNode current = root;
        BSTNode parent;

        while (true) {
            parent = current;

            // Go LEFT if value is smaller
            if (id < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            }
            // Go RIGHT if value is larger
            else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    /**
     * FIND: Searches for a value in the tree
     * - Start from root
     * - If value found → return true
     * - If value smaller → go left, if larger → go right
     * - If reach null → value not found
     */
    public boolean find(int id) {
        BSTNode current = root;

        while (current != null) {
            if (current.data == id)
                return true;
            else if (current.data > id)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

    /**
     * DISPLAY (In-order Traversal): LEFT → ROOT → RIGHT
     * This prints values in SORTED order
     */
    public void display(BSTNode root) {
        if (root != null) {
            display(root.left);          // First: Left subtree
            System.out.print(" " + root.data);  // Second: Root
            display(root.right);         // Third: Right subtree
        }
    }

    public static void main(String[] args) {
        BinarySearchTree1 obj = new BinarySearchTree1();

        // Insert sample values
        obj.insert(3);
        obj.insert(8);
        obj.insert(1);
        obj.insert(4);
        obj.insert(6);
        obj.insert(2);
        obj.insert(10);
        obj.insert(9);
        obj.insert(20);
        obj.insert(25);
        obj.insert(15);
        obj.insert(16);

        // Display sorted tree
        System.out.println("Original Tree : ");
        obj.display(root);

        // Search for a value
        System.out.println("\n\nCheck Value 4 Exists : " + obj.find(4));
        System.out.println();
    }
}