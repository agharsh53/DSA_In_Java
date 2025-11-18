package String;

import java.util.Scanner;

public class patternMatching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine().trim();
        String p = sc.nextLine().trim();
        System.out.println(isMatched(s,p));
    }
    public static boolean isMatched(String s, String p){
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n][m];
        dp[0][0]=true;
        for(int j=1; j<=m; j++){
            dp[0][j]=dp[0][j-1];
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(p.charAt(j-1)==s.charAt(i-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                } else if (p.charAt(j - 1) == '*') {

                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
}
