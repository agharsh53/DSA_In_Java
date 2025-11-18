package harsh;

import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the integer ");
//        int rollno = input.nextInt();
//        System.out.println("your roll number is " + rollno);
//
//        int  a = 234_000_000;
//        System.out.println(a);

        String name = input.nextLine();
        int x = input.nextInt();
//        System.out.println(name);
//
//        float marks = input.nextFloat();
//        System.out.println(marks);
        System.out.printf("%-14s %03d\n", name, x);
    }
}
