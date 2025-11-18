package harsh;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of num1 and num2");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2 ;
        System.out.println("Sum is " +sum);
    }
}
