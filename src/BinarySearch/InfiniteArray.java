package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
      int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140 , 170, 190,};
      int target = 10;
      int ans = ans(arr, target);
        System.out.println(ans);
    }
    public static int ans(int[] arr, int target){
      //first find the range
      //first start box six from end if it does not match then twice the end size
        int start = 0;
        int end =  1;
        //condition for target greater then end
        while(target> arr[end]){
            int temp = end+1;  //this is new start
            //double the box value
            //end = previous end + sizeofbox*2;
            end = end + (end-start+1)*2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start , int end){
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
        return -1;
    }
}
