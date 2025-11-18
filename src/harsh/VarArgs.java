package harsh;
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(78,55,81,23,52,18); // variable langraginies
        multiple(8,34,"harsh","Kunal","Aman");
        demo("Harsh agrawal","Manish sharma");
        demo(87,56);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
        //String ...v always comes at he end of the definition

    }
}
