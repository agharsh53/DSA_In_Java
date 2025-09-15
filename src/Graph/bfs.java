package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visit = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visit[0] = true;

        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(int it : adj.get(node)){
                if(visit[it]==false){
                    visit[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        int v =5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        bfs b1 = new bfs();
        ArrayList<Integer> ans = b1.bfsOfGraph(v,adj);
        int n = ans.size();
        for(int i=0; i<n; i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
