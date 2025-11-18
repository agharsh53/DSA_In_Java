package harsh;
import java.util.Scanner;
public class ReverseN0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int ans = 0;
        int a;
        while(n>0){
            a = n%10;
            ans = ans*10+a;
            n = n/10;
        }
        System.out.print("Reverse of number is ");
        System.out.println(ans);
    }
}
