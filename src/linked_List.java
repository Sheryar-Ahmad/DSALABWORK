class Practice{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // inserting elements in the first
    public void insertAtStart(int data){
        Node newNode= new Node(data);
        if (head == null){
            head=newNode;
            return;
        }
            newNode.next=head;
            head=newNode;

    }

    //inserting the elements in the list in the end
    public void insertAtEnd(int data){
        Node newNode= new Node(data);
        if (head == null){
            head=newNode;
            return;
        }
           Node currNode=head;
           while (currNode.next != null){
               currNode=currNode.next;
           }
           currNode.next=newNode;

    }

    public void printList(){
        Node currNode=head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

}
public class linked_List {
    public static void main(String[] args) {

        Practice ll = new Practice();
        ll.insertAtStart(2);
        ll.printList();
        ll.insertAtEnd(3);
        ll.printList();
        ll.insertAtStart(1);
        ll.printList();
        ll.insertAtStart(0);
        ll.printList();
    }
}
