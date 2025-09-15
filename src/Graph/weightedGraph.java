package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class weightedGraph {
    int v;
    ArrayList<ArrayList<HashMap<Integer,Integer>>> adj;
    weightedGraph(int v){
        this.v = v;
        this.adj = new ArrayList<>();
        for (int i=0; i<v; i++){
            this.adj.add(new ArrayList<>());
        }
    }

     void addEdge(int u, int v, int value){
        this.adj.get(u).add(new HashMap<>());
        this.adj.get(u).get(this.adj.get(u).size()-1).put(v,value);


        this.adj.get(v).add(new HashMap<>());
        this.adj.get(v).get(this.adj.get(v).size()-1).put(u,value);
    }

    void printGraph(){
        for(int i=0; i<this.v; i++){
            System.out.println("\nNode "+i+" make an edge with ");
            for(HashMap<Integer,Integer> j:adj.get(i)){
                j.entrySet().forEach(e-> System.out.println("\tNode "+e.getKey()+" with edge weight "+e.getValue()));
            }
        }
    }
    public static void main(String[] args) {
        int v = 5;
        weightedGraph obj = new weightedGraph(v);
        obj.addEdge(0,1,10);
        obj.addEdge(0,4,20);
        obj.addEdge(1,2,30);
        obj.addEdge(1,3,40);
        obj.addEdge(1,4,50);
        obj.addEdge(2,3,60);
        obj.addEdge(3,4,70);
        obj.printGraph();
    }
}
