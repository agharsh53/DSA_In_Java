package GreedyAlgorithims;

import java.util.ArrayList;
import java.util.List;

public class minCoins {
    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList<Integer> coins = minimumNumberCoin(49);
        System.out.println(coins);
    }
    public static ArrayList minimumNumberCoin(int v){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] notes = {1,2,5,10,20,50,100,500,1000};
        int n= notes.length;
        for (int i=n-1; i>=0; i--){
            while(v>=notes[i]){
                v -= notes[i];
                ans.add(notes[i]);
            }
        }
        return ans;
    }
}
