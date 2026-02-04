package GreedyDP;

import java.util.Arrays;

public class LCS {

    static int f(int i, int j, String s, String t, int[][] dp) {
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = 1 + f(i - 1, j - 1, s, t, dp);
        }
        return dp[i][j] = Math.max(f(i - 1, j, s, t, dp),f(i, j - 1, s, t, dp));
    }

    public static int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return f(n - 1, m - 1, text1, text2, dp);
    }

    public static void main(String[] args) {

        String text1 = "ABCBDAB";
        String text2 = "BDCABA";

        int result = longestCommonSubsequence(text1, text2);

        System.out.println("Length of LCS: " + result);
    }
}