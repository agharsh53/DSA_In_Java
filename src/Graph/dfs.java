package Graph;

import java.util.ArrayList;

public class dfs {
    public static void dfs(int node, boolean[] visit, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        visit[node]=true;
        ls.add(node);
        for(Integer it : adj.get(node)){
            if(!visit[it]){
                dfs(it,visit,adj,ls);
            }
        }
    }
    public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[] visit = new boolean[v+1];
        visit[0]=true;
        dfs(0,visit,adj,ls);
        return ls;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        dfs d1 = new dfs();
        ArrayList<Integer> ans = d1.dfsOfGraph(v,adj);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
