package array_assgn;

import java.util.Scanner;

public class MergeArrays {

    // Method to take array input
    public static int[] inputArray(Scanner sc, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to merge two arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }

        return merged;
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of first array:");
        int[] arr1 = inputArray(sc, n1);

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of second array:");
        int[] arr2 = inputArray(sc, n2);

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged Array:");
        printArray(mergedArray);
    }
}
