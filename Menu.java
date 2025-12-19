package seleniumDemo;

import java.util.Scanner;

public class Menu {

    // Linear Search
    public static int linear(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (array must be sorted)
    public static int binarySearch(int[] arr, int elem) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == elem)
                return mid;
            else if (arr[mid] > elem)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    // Maximum Element
    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Even Odd Count
    public static void evenOdd(int[] arr) {
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
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

    // Deletion by position
    public static void deletion(int[] arr, int pos) {
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Array after deletion:");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int elem = sc.nextInt();

        System.out.println("Linear Search index: " + linear(arr, elem));

        insertionSort(arr);  
        System.out.print("Sorted array: ");
        printArray(arr);

        System.out.println("Binary Search index: " + binarySearch(arr, elem));
        System.out.println("Maximum element: " + maxElement(arr));

        evenOdd(arr);

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        deletion(arr, pos);

        
    }
}
