import java.util.Stack;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class DFSTraversal {

    public static void printDFS(List<List<Integer>> adjList, int src) {
        Stack<Integer> st = new Stack<Integer>();
        Set<Integer> visited = new HashSet<Integer>();

        st.add(src);
        visited.add(src);

        System.out.print("DFS Traversal commencing: ");

        while(!st.isEmpty()){
            int top = st.pop();
            System.out.print(top + " ");
            for(Integer num: adjList.get(top)){
                if(!visited.contains(num)){
                    st.add(num);
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
        
        printDFS(AdjList.AdjList, 0);
    }
}
