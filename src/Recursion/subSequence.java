package Recursion;

import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        int arr[] = {2,3,4,2};
        ArrayList<Integer> ds = new ArrayList<>();
        //printF(0,ds,arr,arr.length);
        System.out.println(sumF(0,ds,arr,arr.length));
    }
    public static void printF(int ind, ArrayList<Integer> ds, int[] arr, int n){
        if(ind>=n){
            for(Integer p : ds){
                System.out.print(p+" ");
            }
            if(ds.size()==0){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }

        ds.add(arr[ind]);
        printF(ind+1,ds,arr,n);
        ds.remove(ds.size()-1);
        printF(ind+1,ds,arr,n);
    }
    public static int sumF(int ind, ArrayList<Integer> ds, int[] arr, int n){
        if(ind>=n){
            if(ds.size()==0) return 0;
            if(threeConsecutive(ds)){
                return 0;
            }
            return 1;
        }

        ds.add(arr[ind]);
        int take =  sumF(ind+1,ds,arr,n);
        ds.remove(ds.size()-1);
        int notTake =  sumF(ind+1,ds,arr,n);
        return take+notTake;
    }
    public static boolean threeConsecutive(ArrayList<Integer> ds){
        int n= ds.size();
        int i=0;
        while(i<n-2){
            if(ds.get(i)%2==0 && ds.get(i+1)%2==0 && ds.get(i+2)%2==0){
                return true;
            }else if(ds.get(i)%2!=0 && ds.get(i+1)%2!=0 && ds.get(i+2)%2!=0){
                return true;
            }else{
                i++;
            }
        }
        return false;
    }
}
