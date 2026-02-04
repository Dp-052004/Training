package GreedyDP;

import java.util.*;

public class ActivitySelection {

    public static void selectActivities(int[] start, int[] finish) {

        int n = start.length;

        // Step 1: Create index array for sorting
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // Step 2: Sort activities by finish time
        Arrays.sort(idx, (a, b) -> finish[a] - finish[b]);

        System.out.println("Selected Activities:");

        // Step 3: Pick first activity
        int lastFinish = finish[idx[0]];
        System.out.println("(" + start[idx[0]] + ", " + finish[idx[0]] + ")");

        // Step 4: Select remaining activities greedily
        for (int i = 1; i < n; i++) {
            int curr = idx[i];
            if (start[curr] >= lastFinish) {
                System.out.println("(" + start[curr] + ", " + finish[curr] + ")");
                lastFinish = finish[curr];
            }
        }
    }

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        selectActivities(start, finish);
    }
}
