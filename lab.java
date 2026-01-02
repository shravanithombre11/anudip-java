import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input array elements
        System.out.println("Enter 5 integer elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = -1;

        // Linear search logic
        for (int i = 0; i < 5; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        // Output result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
