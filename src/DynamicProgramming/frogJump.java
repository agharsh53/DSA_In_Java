package DynamicProgramming;
import java.util.Arrays;
public class frogJump {
    public static void main(String[] args) {
        int[] heights= {30,10,60,10,60,50};
        System.out.println(minFrogJump(heights));
        System.out.println(tF(heights,heights.length));
        System.out.println(spaceOtimizationF(heights,heights.length));
    }
    public static int minFrogJump(int[] heights) {
        int[] dp = new int[heights.length];
        Arrays.fill(dp,-1);
        return f(heights,heights.length-1,dp);
    }
    public static int f(int[] heights, int n,int[] dp){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int jumpTwo=Integer.MAX_VALUE;
        int jumpOne = f(heights,n-1,dp)+Math.abs(heights[n]-heights[n-1]);

        if(n>1) jumpTwo =  f(heights,n-2,dp)+Math.abs(heights[n]-heights[n-2]);

        return dp[n]= Math.min(jumpOne,jumpTwo);
    }
    public static int tF(int[] heights, int n){
        int[] dp = new int[n];
        dp[0]=0;
        for(int i=1; i<n; i++){
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne = dp[i-1]+Math.abs(heights[i]-heights[i-1]);

            if(i>1) jumpTwo = dp[i-2]+ Math.abs(heights[i]-heights[i-2]);
            dp[i] = Math.min(jumpOne,jumpTwo);

        }
        return dp[n-1];
    }

    public static int spaceOtimizationF(int[] heights, int n){
        int prev1=0;
        int prev2 = Math.abs(heights[1]-heights[0]);
        int cur=0;
        for(int i=2; i<n; i++){
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne = prev2+Math.abs(heights[i]-heights[i-1]);

            if(i>1) jumpTwo = prev1+ Math.abs(heights[i]-heights[i-2]);
            cur = Math.min(jumpOne,jumpTwo);
            prev2 = cur;
            prev1 = prev2;

        }
        return cur;
    }
}
