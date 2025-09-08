package GreedyAlgorithims;

import java.util.Arrays;
import java.util.Comparator;

class Item{
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
class itemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a, Item b){
        double r1 = (double)(a.value)/ (double)(a.weight);
        double r2 = (double)(b.value)/ (double)(b.weight);
        if(r1<r2) return 1;
        else if(r1>r2) return -1;
        else return 0;
    }
}
public class fractionalKnapsackProblem {
    public static double fractionalKnapsack(int weight, Item[] arr, int n){
        Arrays.sort(arr,new itemComparator());

        int curWeight=0;
        double finalValue =0.0;
        for(int i=0; i<n; i++){
            if(curWeight+arr[i].weight<=weight){
                curWeight += arr[i].weight;
                finalValue += arr[i].value;
            }
            else{
                int remain = weight-curWeight;
                finalValue += ((double)arr[i].value / (double)arr[i].weight)*remain;
                break;
            }
        }
        return finalValue;
    }
    public static void main(String[] args) {
        int n=3, weight=50;
        Item[] arr = {new Item(100,20),new Item(60,10),new Item(120,30)};
        double ans = fractionalKnapsack(weight,arr,n);
        System.out.println("The Maximum Value is "+ans);
    }

}
