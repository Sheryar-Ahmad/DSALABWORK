class Practice{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // inserting elements in the first
    public void insertAtStart(int data){
        Node newNode=new Node(data);
        if (head == null){
            head=newNode;
            return;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    //inserting the elements in the list in the end
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if (head == null){
            head=newNode;
            return;
        }
        else{
           Node currNode=head;
           while (currNode != null){
               currNode=currNode.next;
           }
           currNode.next=newNode;
        }
    }

}
public class linked_List {
    public static void main(String[] args) {

    }
}
