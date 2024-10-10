import java.util.Scanner;

public class BubbleSort {

    // Function to print the array
    public static void printArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        
        System.out.println();  
    }

    // Function to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        // Swapping using third variable
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        
        // Swapping without third variable
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap using the helper swap function
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            // If no elements were swapped, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    // Main function to take input and invoke sorting
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;  
        }
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        // Perform bubble sort
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);
        
        sc.close();  
    }
}
