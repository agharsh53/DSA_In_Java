package harsh;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 30;

        //Swap the value
//        int temp =a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a+" "+b);

        String name = "Harsh Agrawal";
        changeName(name);
        System.out.println(name);
    }

    static String changeName(String name){
        name ="Kunal Kushwaha";
        return name;
    }
    static void swap(int a, int b){
        int temp =a;
        a = b;
        b = temp;
    }
}
