package BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
      // int[] arr  = {4, 5, 6, 7, 0, 1, 2};
        int[] arr = {5, 1, 3};
        System.out.println(findPivot(arr));
        int target = 5;
        System.out.println(search(arr,target));
    }

    static int search(int[] nums, int target) {
       int pivot = findPivot(nums);
       //if you did not find the pivot it means array is not rotated
        if(pivot == -1) {
            //just do simple binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
            //if pivot is found , you have found two ace sorted arr;
            if(nums[pivot] == target){
                return pivot;
            }
            if(target>= nums[0]){
                return binarySearch(nums, target, 0, pivot-1);
            }
        return binarySearch(nums, target, pivot+1,nums.length-1);
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
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            //such 4 cases are here
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid> start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            //such 4 cases are here
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid> end && arr[mid] < arr[mid - 1]){
                return mid-1;
            }

            //if element at middle, start, end are equal than just skip the duplicate
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //skip the duplicate
                //Note: what if these element at start and end were the pivot?
                //check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                //check whether end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, pivot should be in right
            else if(arr[start]< arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
