import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class DFSBacktrack {

    public static Set<Integer> visited = new HashSet<Integer>();
    
    public static void printDFS(List<List<Integer>> adjList, int src){
        visited.add(src);
        System.out.print(src + " ");

        for(Integer num: adjList.get(src)){
            if(!visited.contains(num)) {
                printDFS(adjList, num);
            }
        }
    }

    public static void main(String argS[]){
        AdjacencyList AdjList = new AdjacencyList(false, 5);

        AdjList.addEdge(0, 1);
        AdjList.addEdge(0, 4);
        AdjList.addEdge(1, 4);
        AdjList.addEdge(1, 3);
        AdjList.addEdge(1, 2);
        AdjList.addEdge(2, 3);
        AdjList.addEdge(3, 4);

        AdjList.printGraph();

        System.out.print("DFS commencing: ");
        
        printDFS(AdjList.AdjList, 0);
    }
}
