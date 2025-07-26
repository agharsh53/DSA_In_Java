package problemSolving;

import java.util.Scanner;

public class MinimumMove {
    //https://www.geeksforgeeks.org/dsa/minimum-number-operation-required-convert-number-x-y/
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String output = calculateFunct(s);
        System.out.println(output);
    }
    public static String calculateFunct(String str){
        String[] s = str.split(" ");
        int num = Integer.parseInt(s[0]);
        int target = Integer.parseInt(s[1]);
        int count = 0;
        if(num<=0 && target>0){
            return "-1";
        }

        while(num!=target){
            if(num-1==target){
                count += 1;
                num -= 1;
            }else{
                count += 1;
                num *= 2;
            }
            if(num>target){

                int add = num-target;
                count += add;
                num -= add;
            }
        }
        String ans = Integer.toString(count);
        return ans;
    }
}
