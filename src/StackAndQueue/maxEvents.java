package StackAndQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Arrays;

//leetcode problem no. 1353.
//Maximum number of event that can be attended
public class maxEvents {
    public static void main(String[] args) {
        int[][] events = {{1,4},{4,4},{2,2},{3,4},{1,1}};
        // ex: [[1,2],[2,3],[3,4],[1,2]]=4, [[1,2],[2,3],[3,4]] = 3
        System.out.println("Maximum Events attend :"+maxEvents(events));
    }
    public static int maxEvents(int[][] events) {
        //First sort the arr on the basis of 1st colm
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row1[0], row2[0]);
            }
        });
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n=events.length;
        int count=0, i=0;
        int day = events[0][0];
        while(!minHeap.isEmpty() || i<n){
            //if day start to 5 for time limit
            if(minHeap.isEmpty()){
                day = events[i][0];
            }
            System.out.println("Day:"+day);
            // it include all the events on the basis of current day
            while(i<n && day==events[i][0]){
                minHeap.add(events[i][1]);
                System.out.println(events[i][1]);
                i++;
            }

            if(!minHeap.isEmpty()){
                minHeap.poll();
                count++;
            }
            day++;

            //skip those days whose endDay < day
            while(!minHeap.isEmpty() && minHeap.peek()<day){
                minHeap.poll();
            }
        }
        return count;
    }
}
