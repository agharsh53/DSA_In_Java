package Hashmaps;

import java.util.HashMap;
import java.util.Scanner;

// Mock Test HackWithInfy question i
// The first line contains an integer, N denoting the number of elements in A.
// The next line contains an integer, K denoting the limit on the distinct elements.
// Each line of the N sequence lines(Where 1<i<N) contains an integer describing A[i].
// Sample input : 12 2 1 2 2 3 2 3 5 1 2 1 1 sample output : 12
// Sample input : 3 1 -1 -2 -3 sample output : 0
public class maxGoodSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array  ");
        int n= sc.nextInt();
        System.out.print("Enter the K value ");
        int k = sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        System.out.println(maxGoodSubarraySum(A,k));
    }

    public static long maxGoodSubarraySum(int[] A, int k){
        int left=0,n=A.length;
        long maxSum=0,currentSum=0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            freq.put(A[i],freq.getOrDefault(A[i],0)+1);
            currentSum += A[i];

            while(freq.size()>k){
                freq.put(A[left],freq.get(A[left])-1);
                currentSum -= A[left];
                if(freq.get(A[left]) ==0){
                    freq.remove(A[left]);
                }
                left++;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

