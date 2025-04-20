package BinarySearch;

import java.util.Arrays;

public class countOccurrense {
    public static void main(String[] args) {
        int[] arr = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int[] ans = {-1, -1};
        int start = findCount(arr, arr.length, 3,true);
        if(start==-1) return;
        int end = findCount(arr,arr.length,3,false);
        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
        System.out.println(end-start+1);
    }
    public static int findCount(int[] arr, int n, int target, boolean isfind){
        int ans = -1;
        int start=0, end=n-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                if(isfind){
                    ans = mid;
                    end = mid-1;
                }else{
                    ans = mid;
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
