package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class uniquePathUsingTabulation {
    public static void main(String[] args) {
        System.out.println("Using Tabulation Method "+uniquePaths(3,3));
        System.out.println("Using Space Optimization Method "+uniquePathsUsingSpaceOptimization(3,3));
    }
    public static int uniquePaths(int m, int n){
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else {
                    int up = 0;
                    int left = 0;
                    if (i > 0) up = dp[i - 1][j];
                    if (j > 0) left = dp[i][j - 1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static int uniquePathsUsingSpaceOptimization(int m, int n){
        int[] prev = new int[n];
        for(int i=0; i<m; i++){
            int[] cur = new int[n];
            for (int j=0; j<n; j++){
                if(i==0 && j==0) cur[j]=1;
                else{
                    int up=0;
                    int left=0;
                    if(i>0) up=prev[j];
                    if(j>0) left=cur[j-1];
                    cur[j] = up+left;
                }
            }
            prev = cur;
        }
        return prev[n-1];

    }
}
