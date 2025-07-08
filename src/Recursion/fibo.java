package Recursion;

public class fibo {
    public static void main(String[] args) {
        int dp[] = new int[51];
        int ans = fibonacci(50,dp);
        System.out.println(ans);
    }

    static int fibonacci(int num, int[] dp){

        //base condition
        if(num<2){
            return num;
        }
        if(dp[num]!=0){
            return dp[num];
        }
        dp[num] = fibonacci(num-1,dp)+ fibonacci(num-2,dp);;
        return dp[num];
    }
}
