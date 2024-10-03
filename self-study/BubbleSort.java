import java.util.Scanner;

public class BubbleSort {
    public static void printArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // int temp = arr[j];
                    // arr[j] = arr[j + 1];
                    // arr[j + 1] = temp;
                    
                    // Swappint without third variables
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter Size of the array: ");
        
		int n = sc.nextInt();
		
        System.out.println("Enter array Elements");
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements before Sorting");
		printArray(arr);
		
		bubbleSort(arr);
		
		System.out.println("Array Elements before Sorting");
		printArray(arr);
	}
}
