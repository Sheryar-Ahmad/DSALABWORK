public class ArraySorting {
  
    // Bubble sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

  //Seclection sort
     selectionSort(b);
        System.out.print("Selection sort: ");
        printArray(b);

    static void printArray(int[] arr) {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

   //Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
   

    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int[] b = a.clone();
        int[] c = a.clone();

        bubbleSort(a);
        System.out.print("Bubble sort:    ");
        printArray(a);

       selectionSort(b);
        System.out.print("Selection sort: ");
        printArray(b);

       insertionSort(c);
        System.out.print("Insertion sort: ");
        printArray(c);

    }
}
