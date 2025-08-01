package AssessmentTest;
import java.util.*;
public class rotateArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 4;
        rotate(arr,d);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotate(int[] arr, int d){
        int n= arr.length;
        d = d%n;
        int temp[] =new int[d];
        for(int i=0; i <d; i++){
            temp[i]= arr[i];
        }
        for(int i=0; i<n-d; i++){
            arr[i] = arr[i+d];
        }
        int j=0;
        for(int i=n-d; i<n; i++){
            arr[i] = temp[j];
            j++;
        }
    }
}
