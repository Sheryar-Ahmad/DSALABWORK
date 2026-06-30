
public class Recursive_Binary_Search {
    int binaryRecursiveSearch(int array[],int startIndex,int endIndex,int targetElement){
        if (endIndex>=startIndex && startIndex<=array.length-1){

            int middleIndex=startIndex+(endIndex-startIndex)/2;

            // If the element is present at the middle itself
            if (array[middleIndex]==targetElement){
                return middleIndex;
            }
            // If element is smaller than middle element,
            // then it can only be present in left subarray
            else if (array[middleIndex]>targetElement){
                return binaryRecursiveSearch(array,startIndex,middleIndex-1,targetElement);
            }
            // Else the element can only be present in right subarray
            else if(array[middleIndex]<targetElement){
                return binaryRecursiveSearch(array,endIndex,middleIndex+1,targetElement);
            }
        }
        // We reach here when element is not present in array
        return -1;
    }
    public static void main(String[] args) {
        Recursive_Binary_Search RBS=new Recursive_Binary_Search();

        int [] sorted_Array={1,2,3,4,5,6,7,8,9,10};

        int length=sorted_Array.length;

        int targetElement=5;

        // Calling binary search method
        int resultIndex = RBS.binaryRecursiveSearch(sorted_Array, 0, length - 1, targetElement);

        if (resultIndex==-1){
            System.out.println("The element is not present in the Array");
        }
        // Element found
        else {
            System.out.println("Element found at index " + resultIndex);
        }


    }
}
