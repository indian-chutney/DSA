import java.util.List;
import java.util.ArrayList;

public class AdjacencyList {
    public boolean isDi;
    public static List<List<Integer>> AdjList;

    AdjacencyList(boolean isDi, int vertices) {
        this.isDi = isDi;
        this.AdjList = new ArrayList<>(vertices);

        for(int i = 0; i < vertices; i++){
            this.AdjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v){
        AdjList.get(u).add(v);
        if(!isDi){
            AdjList.get(v).add(u);
        }
    }

    public static void printGraph(){
        for(int i = 0; i < AdjList.size(); i++){
            System.out.print(i + " : ");
            if(AdjList.get(i).isEmpty()) {
                System.out.println("NULL");
                continue;
            }
            for (Integer val: AdjList.get(i)){
                System.out.print(val + ", ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        AdjacencyList adj = new AdjacencyList(false, 4);
        adj.addEdge(0, 1);
        adj.addEdge(1, 2);
        adj.addEdge(2, 3);

        adj.printGraph();
    }
} 
