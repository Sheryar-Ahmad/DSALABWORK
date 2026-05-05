public class myStack {
    private int nsize= 5;
    int []arr= new int[nsize];
    int top=-1;

    public boolean isEmpty(){
        if (top <= -1)
        return true;
        else
            return false;
    }

    public boolean isFull(){
        if (top >= nsize-1)
            return true;
        else
            return false;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is Full, No more elements can be added");
        }
        else {
            top++;
            arr[top]=value;
            System.out.println("Element Added to Stack: "+value);
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
            System.out.println("Element removed is : "+arr[top]);
            return top--;
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("The peek value is: "+arr[top]);
        }
    }

    public int size(){
        return (top+1);
    }

    public void printstack(){
        for (int i=size()-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        myStack stack=new myStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printstack();
    }
}