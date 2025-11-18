package harsh;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the Temperature in C : ");
        float temC = in.nextFloat();
        float tempF = (temC*9/5) + 32;
        System.out.println(tempF);
    }
}
