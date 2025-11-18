package harsh;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {

        /*
        syntax for loop
        for( initialisation declaration increament decrement){
         // boby
         }
         */
        // Q: Print number from 1 to 5
//        for( int num =1; num>=5; num++){
//            System.out.println(num);
//        }

//        // Q: Print number from 1 to n
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter the number :");
//        int n = in.nextInt();
//        for (int num = 1; num <=n; num++) {
//           System.out.print(num);
//            System.out.println(" Hello World ");
//        }

        /*
        for while loop
        syntax:
        while(condition){
           body
           }
         */

        int num = 1;
        while(num<=5){
            System.out.println(num);
            num += 1;
        }

        /*
            do while loop

        syntax:
        do{
             //body
        }while(condition);
         */
       int n = 1;
        do{
            System.out.println("Hello world");
        }while(n!=1);


    }
}
