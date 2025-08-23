package BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
        
    }

    // return the index of greatest no <= target
    //floor is just the number which is greatest number among the smallest number from target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //find the middle element
            // int mid = (start +end ) / 2;  might be possible that (start - end) /2  exceeds the range of int java
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                //ans find
                return mid;
            }
        }
        return end;
    }
}
