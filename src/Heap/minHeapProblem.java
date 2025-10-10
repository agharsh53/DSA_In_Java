package Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// 3318 Find X Sum of All K-long Subarrays -I leetcode problem
public class minHeapProblem {
    static class Pair{
        int freq;
        int value;
        Pair(int f, int v){
            freq = f;
            value = v;
        }
    }
    public static int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;;
        int[] result = new int[n-k+1];
        int i=0, j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(j-i+1==k){
                result[i] =findTopXSum(map,x);
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            j++;
        }
        return result;
    }
    public static int findTopXSum(HashMap<Integer,Integer> map, int x){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b)-> a.freq!=b.freq ? a.freq - b.freq : a.value - b.value);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getValue(),entry.getKey()));
            if(pq.size()>x){
                pq.poll();
            }
        }
        int sum = 0;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            //pq.poll();
            sum += (p.freq*p.value);
        }
        return sum;
    }
    public static void main(String[] args) {
       int[] nums = {1,1,2,2,3,4,2,3};
       int k=6;
       int x=2;
       int[] ans = findXSum(nums,k,x);
        System.out.println(Arrays.toString(ans));
    }
}
