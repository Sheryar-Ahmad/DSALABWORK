public class LL {
    private Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if (head == null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void printList(){
        Node currNode=head;
        while (currNode != null){
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void printlist(){

        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("A");
        list.addFirst("B");
        list.addLast("A+");
        list.printList();
    }
}
