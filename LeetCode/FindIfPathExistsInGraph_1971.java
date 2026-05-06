import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindIfPathExistsInGraph_1971 {

    static Set<Integer> visited = new HashSet<>();
    public static void main(String[] args) {
        int n = 5;
        // int[][] edges = {{0,1},{1,2},{2,0}};
        int[][] edges = {{0,4}};
        int source = 0, destination = 4;
        boolean result = validPath(n, edges, source, destination);
        System.out.println("result is   "+result); 

    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];

            if(!graph.containsKey(u)){
                graph.put(u,new ArrayList<>());
            }
            if(!graph.containsKey(v)){
                graph.put(v,new ArrayList<>());
            }

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return dfs(graph,source,destination);
    }

    public static boolean dfs(Map<Integer,List<Integer>> graph, int source, int destination){
        if(source == destination){
            return true;
        }
        if(!graph.containsKey(source)){
            return false;
        }
        if(visited.contains(source)){
          return false;
        }
        

        visited.add(source);

        boolean isReachable = false;

        for(int node:graph.get(source)){
            isReachable = isReachable || dfs(graph,node,destination);
        }
        return isReachable;
    }

}
