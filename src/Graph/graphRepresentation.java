package Graph;

import java.util.*;

public class graphRepresentation {
    public static void displayAdjList(List<List<Integer>> adj){
        for (int i=0; i<adj.size(); i++){
            System.out.print(i+" : ");
            for (int j : adj.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the node : ");
        int n = sc.nextInt();
        System.out.println("Enter the edges : ");
        int m = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            int v = sc.nextInt();
            int u = sc.nextInt();
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        displayAdjList(adj);
    }

}
