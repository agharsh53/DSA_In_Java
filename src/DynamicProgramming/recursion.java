package DynamicProgramming;
import java.util.*;
public class recursion {
    //Memorization approach in Dynamic Programming means Bottom - Top approach base condition

    static int f(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!= 0) return dp[n];
        return dp[n]= f(n-1,dp) + f(n-2,dp);
    }

    public static void main(String []args) {

        int n=5;
        int[] dp = new int[n+1];
        //Arrays.fill(dp,-1);
        System.out.println(f(n,dp));

    }
}
