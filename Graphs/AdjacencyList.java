import java.util.ArrayList;

public class AdjacencyList {
    public boolean isDi;
    public ArrayList<Integer>[] AdjList;

    AdjacencyList(boolean isDi, int vertices) {
        this.isDi = isDi;
        this.AdjList = (ArrayList<Integer>[]) new ArrayList[vertices];
    }

    public void addEdge(int u, int v){
        if(AdjList[u] == null){
            AdjList[u] = new ArrayList<Integer>();
        }
        AdjList[u].add(v);
        if(!isDi){
            if(AdjList[v] == null){
                AdjList[v] = new ArrayList<Integer>();
            }
            AdjList[v].add(u);
        }
    }

    public void printGraph(){
        for(int i = 0; i < AdjList.length; i++){
            System.out.print(i + " : ");
            if(AdjList[i] == null) {
                System.out.println("NULL");
                continue;
            }
            for (Integer val: AdjList[i]){
                System.out.print(val + ", ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        AdjacencyList adj = new AdjacencyList(false, 3);
        adj.addEdge(1, 2);
        adj.addEdge(0, 2);
        adj.addEdge(0, 1);

        adj.printGraph();
    }
}       
