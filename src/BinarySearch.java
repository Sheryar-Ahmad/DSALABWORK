public class BinarySearch {
    public static void main(String[] args) {
        int [] A={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int index=binarysearch(A,13);
        if (index !=-1){
            System.out.println("Found At Index: "+index);
        }else{
            System.out.println("Not Found");
        }
    }
    private static int binarysearch(int[] a, int key) {
        int lowerbound=0;
        int upperbound=a.length-1;
        int curIn;
        while (true){
            curIn=(lowerbound+upperbound)/2;
            if (a[curIn]==key){
                return curIn;
            } else if (lowerbound>upperbound) {
                return -1;
            } else {
                if (a[curIn]<key){
                    lowerbound=curIn+1;
                }else {
                    upperbound=curIn-1;
                }
            }
        }
    }
}
