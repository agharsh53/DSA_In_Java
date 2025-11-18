package harsh;
import java.util.Scanner;
public class Scope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=10, b=29;
        String name = "Harsh";
        {
            a = 100; //reassign the original ref variable to some other values
//            int a = 89; // already initialised outside the block in the same variable
            int c = 56;
            name = "Kunal";
            System.out.println(name);
            //values initialised in the block, will remain in block
            System.out.println(a);
            System.out.println(name);
        }
//        System.out.println(c); // cannot use outside the block
        System.out.println(a);
    }

    static void random(int marks){
        int num = 57;
        System.out.println(num);
        System.out.println(marks);
    }
}
