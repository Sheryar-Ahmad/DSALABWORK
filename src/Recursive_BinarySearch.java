public class Recursive_BinarySearch {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int index = recursive_binarysearch(A, 13,1,A.length);
        if (index != -1) {
            System.out.println("Found At Index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }
    private static int recursive_binarysearch(int[] a, int key, int lowerbound, int upperbound) {
        int currIn;
        currIn = (lowerbound + upperbound) / 2;
        if (a[currIn] == key) {
            return currIn;
        } else if (lowerbound > upperbound) {
            return -1;
        } else {
            if (a[currIn] < key) {
                return recursive_binarysearch(a, key, currIn + 1, upperbound);
            } else {
                recursive_binarysearch(a, key, currIn, lowerbound);
            }
        }
        return currIn;
    }
}
