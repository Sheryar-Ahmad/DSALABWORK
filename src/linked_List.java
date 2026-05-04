class Practice {
    Node head;
    static class Node{
        String data;
        Node next;

        Node(String value){
            data=value;
            this.next=null;
        }
    }

    public void printAtStart(String value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode; // head points to the newNode as there is no Node present in the start
            return ;
        }
        newNode.next=head; // here head means the old node so the newNode.next 'pointer' points to the old node that is present before
        head = newNode;// here is the newNode again made the head
    }

    public void printAtEnd(String value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode; // head points to the newNode
            return;
        }

        Node currNode=head;
        while (currNode.next != null){
            currNode=currNode.next;
        }

        currNode.next=newNode; // here when it got the last node and check its pointer is null then it would make
        // that pointer to point to the newNode that is being created
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }

        Node currNode = head;
        while (currNode != null ){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
}
public class linked_List {
    public static void main(String[] args) {

         Practice ll = new Practice();
         ll.printAtEnd("C");
         ll.printList();
         ll.printAtStart("B");
         ll.printList();
         ll.printAtStart("A");
         ll.printList();
    }
}
