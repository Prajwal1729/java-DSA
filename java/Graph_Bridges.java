import java.util.*;
public class Graph_Bridges {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));

    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[],int dt[],int lt[],
    int time,int par){
            vis[curr] = true;
            dt[curr] = lt[curr] = ++time;
            for(int i = 0;i<graph[curr].size();i++){
                 Edge e = graph[curr].get(i);
                 if(e.dest==par){
                    continue;
                 }
                 else if(!vis[e.dest]){
                    dfs(graph, e.dest, vis, dt,lt,time, curr);
                    lt[curr] = Math.min(lt[curr],lt[e.dest]);
                    if(dt[curr] < lt[e.dest]){
                        System.out.println("Bridge is: "+ curr + "----"+ e.dest);
                    }
                }
                else{
                 lt[curr] = Math.min(lt[curr],dt[e.dest]);
            }
                    
                 
         }
    }

    public static void tarjansAlgorithm(ArrayList<Edge> graph[],int V){
        int dt[] = new int[V];
        int lt[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!vis[i]){
                 dfs(graph, i, vis, dt, lt, time, -1);
            }

        }

    }
    
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        tarjansAlgorithm(graph, V);
    }
    
}
