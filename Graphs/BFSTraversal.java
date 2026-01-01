import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Queue;
import java.util.List;

public class BFSTraversal {

    public static void printBFS(List<List<Integer>> adjList, int src) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        Set<Integer> visited = new HashSet<Integer>();

        q.add(src);
        visited.add(src);

        System.out.print("BFS Traversal commencing: ");

        while(!q.isEmpty()){
            int top = q.remove();
            System.out.print(top + " ");
            for(Integer num: adjList.get(top)){
                if(!visited.contains(num)){
                    q.add(num);
                    visited.add(num);
                }
            }
        }

        System.out.println();
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
        
        printBFS(AdjList.AdjList, 0);
    }
}
