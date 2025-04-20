package Recursion;

public class implementation {
    public static void main(String[] args) {
        recursion(5);
    }

    static void recursion(int num){
        double square = Math.pow(num,2);
        System.out.format("%.0f",square);
        System.out.println();
        //base condition
        if(num==5){
            System.out.format("%.02f",square);
            System.out.println();
            return;
        }
        else{
            //recursive call
            //if you are calling a function again and again, you can treat it  as a separate call in the stack
            recursion(num+1);
            System.out.format("%.0f",square);
            System.out.println();
        }
    }
}
