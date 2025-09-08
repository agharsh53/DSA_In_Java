package DynamicProgramming;

public class uniquePathWithObstacles {
    public static void main(String[] args) {
        int[][] robot = {{0,0,0},{0,-1,0},{0,0,0}};
        System.out.println("Using Recursion "+totalUniquePath(3,3,robot));
        System.out.println("Using Memorisation "+totalUniquePathUsingMemorisation(3,3,robot));
        System.out.println("Using Tabulation Method "+uniquePaths(3,3,robot));
        System.out.println("Using Space Optimization Method "+uniquePathsUsingSpaceOptimization(3,3,robot));
    }
    public static int uniquePaths(int m, int n,int[][] robot){
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                if(i>=0 && j>=0 && robot[i][j]==-1){
                    dp[i][j]=0;
                    continue;
                }
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

    public static int uniquePathsUsingSpaceOptimization(int m, int n,int[][] robot){
        int[] prev = new int[n];
        for(int i=0; i<m; i++){
            int[] cur = new int[n];
            for (int j=0; j<n; j++){
                if(i>=0 && j>=0 && robot[i][j]==-1){
                    cur[j]=0;
                    continue;
                }

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
    public static int totalUniquePathUsingMemorisation(int m, int n, int[][] robot){
        int[][] dp = new int[m][n];
        return fM(m-1,n-1,dp,robot);
    }
    public static int fM(int i, int j, int[][] dp,int[][] robot){
        if(i>=0 && j>=0 && robot[i][j]==-1) return 0;
        if(i==0 && j==0) return 1;

        if(i<0 || j<0) return 0;

        if(dp[i][j] != 0) return dp[i][j];

        int up = fM(i-1,j,dp,robot);
        int left = fM(i,j-1,dp,robot);
        return dp[i][j]=up+left;
    }
    public static int totalUniquePath(int m, int n, int[][] robot){
        return f(m-1,n-1,robot);
    }
    public static int f(int i, int j,int[][] robot){
        if(i>=0 && j>=0 && robot[i][j]==-1) return 0;
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        int up = f(i-1,j,robot);
        int left = f(i,j-1,robot);
        return up+left;
    }
}
