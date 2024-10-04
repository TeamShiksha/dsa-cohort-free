import java.util.Scanner;

public class QuickSort {

    // Function to print the array
    public static void printArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        
        System.out.println(); 
    }

    // Function to swap without using third variables
    public static void swap(int[] arr, int i, int j) {
        if (i != j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }

    // Partition function
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];  
        int i = start;

        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, start, i);
        return i;
    }

    // Recursive QuickSort function
    public static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            
            quicksort(arr, start, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;  
        }

        int[] arr = new int[n];

        // Prompt user to enter array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform QuickSort
        quicksort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        sc.close();  
    }
}
