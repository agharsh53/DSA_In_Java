package Hashmaps;

import java.util.HashMap;

public class seriesCreation {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        int[] arr = new int[101];
        arr[0]=0;

        for(int i=1; i<100; i++){
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i]);
                map.put(arr[i],i);
                arr[i+1]=i-temp;
            }else{
                arr[i+1]=0;
                map.put(arr[i],i);
            }
        }
        for(int i=0; i<101; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
