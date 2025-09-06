package harsh;
import java.util.Arrays;
import java.util.Scanner;
public class Changevalue {
    public static void main(String[] args) {
        //create an array
        int[] arr  = {1, 2, 3, 5, 56,78};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99; // if you arre make a change to the object via this ref variable, same object will be changed
    }
}
