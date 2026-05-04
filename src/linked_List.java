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

    //Insert At First
    public void printAtStart(String value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode; // head points to the newNode as there is no Node present in the start
            return ;
        }
        newNode.next=head; // here head means the old node so the newNode.next 'pointer' points to the old node that is present before
        head = newNode;// here is the newNode again made the head
    }

    //Insert At Last
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

    //Delete At First of the List
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty ");
            return;
        }

        System.out.println("Deleted: "+ head.data);
        head = head.next;
    }


    // Prints the List
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null ){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        if (head.next == null){
            head =null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;

        while (lastNode != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;

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

         ll.deleteFirst();
         ll.printList();

         ll.deleteLast();
         ll.printList();
    }
}
