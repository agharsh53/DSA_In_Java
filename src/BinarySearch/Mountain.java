package BinarySearch;

public class Mountain {
    public static void main(String[] args) {
    int[] arr = {0, 1, 3, 4,8,7,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of array
                //this may be ans but look at left
                //this is why end ! = mid-1
                end = mid;
            }
            else{
                //you are in ascending part of arr
                start = mid +1; //because we know that mid+1 element > mid element

            }
        }
        // in the end , start == end and pointing to the largest number because of the 2 checks above 3
        //start and end are alwaays trying to find max element in the above 2 checks
        //hence they are pointing to just one element, that is the max one because that is what we chat say
        //more elaboration : at every point of time for start and end , thay have the best possible ans till that time
        //if we are saying only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are  ==
    }
}
