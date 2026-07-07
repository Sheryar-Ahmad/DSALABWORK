class Queue{
    private final int SIZE=20;
    private int [] queueArray;
    private int front;
    private int rear;

    public  Queue(){
        queueArray=new int[SIZE];
        front =0;
        rear=-1;
    }

    public void enqueue(int j){
        if (rear==SIZE-1){
            rear=-1;
        }
        queueArray[++rear]=j;
    }

    public int dequeue(){
        int temp=queueArray[front++];
                if(front == SIZE){
                    front=0;}
                return temp;
    }

    public boolean isEmpty(){
        return (rear + 1 == front || (front + SIZE - 1 == rear));

    }

}

class vertex{
    public char label;
    public boolean wasVisited;

    public vertex(char lab){
        label=lab;
        wasVisited=false;
    }
}

class graph {
    private final int MAX_VERTS = 20;
    private vertex vertexlist[];
    private int adjMat[][];
    private int nVerts;
    private Queue thequeue;

    public graph() {
        vertexlist = new vertex[MAX_VERTS];

        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }
        thequeue = new Queue();
    }

    public void addVertex(char lab) {
        vertexlist[nVerts++] = new vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexlist[v].label);
    }

    public void bfs() {
        vertexlist[0].wasVisited = true;
        displayVertex(0);
        thequeue.enqueue(0);
        int v2;
        while (!thequeue.isEmpty()) {
            int v1 = thequeue.dequeue();

            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {

                vertexlist[v2].wasVisited = true;
                displayVertex(v2);
                thequeue.enqueue(v2);
            }
        }

        for (int j = 0; j < nVerts; j++) {
            vertexlist[j].wasVisited = false;
        }
    }


    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j] == 1 && vertexlist[j].wasVisited == false) {
                return j;
            }
        }
        return -1;
    }
}


public class Breadth_First_Search {
    public static void main(String[] args) {

        graph theGraph = new graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 4);
        System.out.print("Visits: ");
        theGraph.bfs();
        System.out.println();
    }
}

