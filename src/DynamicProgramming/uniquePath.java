package DynamicProgramming;

public class uniquePath {
    public static void main(String[] args) {
        System.out.println("Using Recursion "+totalUniquePath(3,3));
        System.out.println("Using Memorisation "+totalUniquePathUsingMemorisation(3,3));
    }
    public static int totalUniquePathUsingMemorisation(int m, int n){
        int[][] dp = new int[m][n];
        return fM(m-1,n-1,dp);
    }
    public static int fM(int i, int j, int[][] dp){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != 0) return dp[i][j];

        int up = fM(i-1,j,dp);
        int left = fM(i,j-1,dp);
        return dp[i][j]=up+left;
    }
    public static int totalUniquePath(int m, int n){
        return f(m-1,n-1);
    }
    public static int f(int i, int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        int up = f(i-1,j);
        int left = f(i,j-1);
        return up+left;
    }
}
