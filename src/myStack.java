public class myStack {
    private static int nsize=5;
    int []arr=new int[nsize];
    int top=-1;

    public boolean isEmpty(){
        if (top <= -1) // if the top get incremented by one like there is one element that it would return the false which means
            // that the stack is not empty
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if (top >= nsize-1) // it would show that if the stack is not full then return false
            return true;
        else
            return false;
    }

    public void push(int value) { // here the value would be entered by the user
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        } else {
            top++; // here the value of top would be incremented and become 0 from -1
            arr[top] = value;  //here the index 0 would store the value
            System.out.println( value + ": is pushed into stack ");
        }
    }
    public int pop(int value) {
        if (isEmpty()) {
            System.out.println("The stack is underflow");
            return 0;
        } else {
            System.out.println(arr[top] + "Removed form the stack");
            return top--;
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(arr[top]+ " :is at the top of the stack");
        }
        }

    public int size() {
        return (top+1);
    }

    public static void main(String[] args) {
        myStack s1= new myStack();
        s1.push(1);

        // Size of the stack
        System.out.println("Size of the Stack: " +s1.size());

        s1.push(2);
        s1.push(3);

        s1.peek();

    }
}
