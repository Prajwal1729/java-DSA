import java.util.*;
public class Graph_MST {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static class Pair implements Comparable<Pair>{
        int node;
        int c;

        public Pair(int node,int c){
            this.node = node;
            this.c = c;
        }

        @Override 
        public int compareTo(Pair p2){
            return this.c - p2.c;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }

    public static void MST( ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        pq.add(new Pair(0,0));
        int cost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                  vis[curr.node] = true;
                  cost+=curr.c;

                  for(int i = 0;i<graph[curr.node].size();i++){
                      Edge e = graph[curr.node].get(i);
                      if(!vis[e.dest]){
                          pq.add(new Pair(e.dest,e.wt));
                    }
               }
            }
        }
        System.out.println(cost);
 
    }
    
    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        MST(graph);
       
    }
    
}
