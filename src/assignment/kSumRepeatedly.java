package assignment;

import java.util.ArrayList;
import java.util.*;

public class kSumRepeatedly {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        findCombinations(arr,target, new ArrayList<Integer>(), 0);
        if(result.isEmpty()){
            System.out.println("Empty");
        }else{
          for(List<Integer> combination: result){
              for(int num : combination){
                  System.out.print(num+" ");
              }
              System.out.println();
          }
        }

    }
    static void findCombinations(int[] arr, int target, ArrayList<Integer> current, int index){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=index; i<arr.length; i++){
            if(arr[i]>target){
                continue;
            }
            current.add(arr[i]);
            findCombinations(arr,target-arr[i],current,i);
            current.remove(current.size()-1);
        }
    }
}
