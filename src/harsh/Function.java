package harsh;
import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
    //sum();
//    int ans = sum2();
//        System.out.println("Sum = "+ans);

        int a,b;
        int ans = sum3(20 ,54);
        System.out.println(ans);
    }

    //pass the value of numbers when you are calling method in main function
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1 , num2, sum;
        System.out.print("Enter the num1 : ");
        num1 = in.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 , num2, sum;
        System.out.print("Enter the num1 : ");
        num1 = in.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = "+sum);
    }
}
