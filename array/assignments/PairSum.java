package array_assgn;

import java.util.Scanner;

public class PairSum {

    // Method to print all pairs
    public static void findPairs(int[] arr, int target) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }
    }

    // Method to take array input
    public static int[] inputArray(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");
        int[] arr = inputArray(sc, n);

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        System.out.println("Pairs with sum " + target + ":");
        findPairs(arr, target);
    }
}
