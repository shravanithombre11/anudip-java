import java.util.Arrays;

public class BubbleSortDemo {

    
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                  
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

       
        int[] bubbleSortedArray = arr.clone();
        bubbleSort(bubbleSortedArray);
        System.out.println("\nSorted using Bubble Sort:");
        System.out.println(Arrays.toString(bubbleSortedArray));

      
        int[] librarySortedArray = arr.clone();
        Arrays.sort(librarySortedArray);
        System.out.println("\nSorted using Arrays.sort():");
        System.out.println(Arrays.toString(librarySortedArray));
    }
}
