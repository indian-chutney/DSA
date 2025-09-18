public class AdjacencyMatrix {
  public boolean isDi;
  public int vertices;
  public int[][] mat;

  public void addEdge(int x, int y) {
    this.mat[x][y] = 1;
    if (!this.isDi)
      this.mat[y][x] = 1;
  }

  public void printGraph() {
    for (int[] row : this.mat) {
      System.out.print("[");
      for (int val : row) {
        System.out.print(" " + val + " ");
      }
      System.out.print("]");
      System.out.println();
    }
  }

  AdjacencyMatrix(boolean isDi, int vertices) {
    this.isDi = isDi;
    this.vertices = vertices;
    this.mat = new int[this.vertices][this.vertices];
  }

  public static void main(String[] args) {
    AdjacencyMatrix mtx = new AdjacencyMatrix(false, 4);

    mtx.addEdge(0, 1);
    mtx.addEdge(2, 3);
    mtx.addEdge(1, 2);
    mtx.addEdge(0, 2);

    mtx.printGraph();
  }
}
