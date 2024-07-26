package Sorting;

public class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        //
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                return new int[]{arr[index], index+1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
