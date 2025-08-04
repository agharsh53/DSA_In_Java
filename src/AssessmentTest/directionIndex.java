package AssessmentTest;
import java.util.Arrays;
import java.util.Scanner;

public class directionIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String direction = sc.next();
        int[] direction_index = new int[2];
        int i=0;
        while(i<direction.length()){
            char direction2 = direction.charAt(i);
            i +=1;
            int magnitude =0;
            if(i<direction.length() && Character.isDigit(direction.charAt(i))){
                magnitude = direction.charAt(i) -'0';
            }

            System.out.println(magnitude);
            if(direction2=='N'){
                direction_index[1] += magnitude;
            }else if(direction2=='S'){
                direction_index[1] -= magnitude;
            } else if (direction2=='E') {
                direction_index[0] += magnitude;
            }else if(direction2 == 'W'){
                direction_index[0] -= magnitude;
            }
            i +=1;
        }
        System.out.println(Arrays.toString(direction_index));
    }
}
