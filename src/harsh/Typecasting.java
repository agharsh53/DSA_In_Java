package harsh;
import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int num = input.nextInt();
        //float num = input.nextFloat();
        //System.out.println("number is "+num);

        //Type casting
        int num = (int)(54.84f);
        System.out.println(num);

        //automated type promotion is expression
//        int a = 257;  //257/256 = 1
//        byte b = (byte)(a);
//        System.out.println(b);
//
//        byte a1 = 40;
//        byte b2 = 50;
//        byte c = 100;
//        int d = (a1*b2)/c;
//        System.out.println(d);

        int number = 'A';
        System.out.println(number);

        System.out.println(3*5.4);

        byte b = 42;
        char c = 'A';
        short s = 1024;
        int i = 89;
        float f = 25.869f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d-s);
        //float + int  - double = double
        System.out.println((f*b) +" " + (i/c) +" " + (d-s));
        System.out.println(result);

    }
}
