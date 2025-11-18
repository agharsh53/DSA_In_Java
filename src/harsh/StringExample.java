package harsh;
import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String message = "Hello "+name;
        return message;
    }

    static String greet(){
        Scanner in = new Scanner(System.in);
        String greet = "How are you"; //greet : "how are you"
        return greet;
    }
}
