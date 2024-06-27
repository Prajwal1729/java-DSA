import java.util.*;
public class Graph_Question {
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

        // graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,2));

        // graph[1].add(new Edge(1,0));
        // graph[1].add(new Edge(1,3));

        // graph[2].add(new Edge(2,0));
        // graph[2].add(new Edge(2,4));

        // graph[3].add(new Edge(3,1));
        // graph[3].add(new Edge(3,4));
        // graph[3].add(new Edge(3,5));

        // graph[4].add(new Edge(4,2));
        // graph[4].add(new Edge(4,3));
        // graph[4].add(new Edge(4,5));

        // graph[5].add(new Edge(5,3));
        // graph[5].add(new Edge(5,4));
        // graph[5].add(new Edge(5,6));


        // graph[5].add(new Edge(6,5));

        // graph[0].add(new Edge(0,2));

        // graph[1].add(new Edge(1,0));

        // graph[2].add(new Edge(2,3));

        // graph[3].add(new Edge(3,0));


        // graph[5].add(new Edge(5,0));
        // graph[5].add(new Edge(5,2));

        // graph[4].add(new Edge(4,0));
        // graph[4].add(new Edge(4,1));

        // graph[2].add(new Edge(2,3));

        // graph[3].add(new Edge(3,1));


        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));

    }

    public static void sourceToTarget(ArrayList<Edge> graph[],
    boolean vis[],int curr,String path,int tar){
        if(curr==tar){
            System.out.println(path);
            return;
        }

        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false){
                vis[curr] = true;
                sourceToTarget(graph, vis, e.dest, path + e.dest, tar);
                vis[curr] = false;
            }
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
            vis[curr] = true;
            rec[curr] = true;

            for(int i = 0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(rec[e.dest]==true){
                    return true;
                }
                else if(!vis[e.dest]){
                    if(isCycle(graph, vis, e.dest, rec)){
                        return true;
                    }
                }
            }
            rec[curr] = false;
            return false;
    }

    public static void topologicalSortingUtil(ArrayList<Edge> graph[],boolean vis[],int curr,Stack<Integer> s){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topologicalSortingUtil(graph, vis,e.dest, s);
            }
            
        }
        s.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[],int V){
        boolean vis[] = new boolean[V];
        Stack<Integer> s = new Stack<>();

        for(int i = 0;i<V;i++){
            if(!vis[i]){
                topologicalSortingUtil(graph,vis,i,s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static boolean cycleDetection(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==true && par!=e.dest){
                return true;
            }

            if(!vis[e.dest]){
                if(cycleDetection(graph, vis, e.dest, curr)==true){
                    return true;
                }
            }

        }
        return false;

    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // int src = 0;
        // int tar = 5;
        // sourceToTarget(graph, new boolean[V],src,"0", tar);
        // System.out.println(isCycle(graph, new boolean[V], 0,new boolean[V]));

        // topSort(graph, V);

        System.out.println(cycleDetection(graph,new boolean[V],0,-1));


    }
    
}
