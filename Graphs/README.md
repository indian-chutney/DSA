# Graphs

## Implementation of Graphs

- It could be an adjacency matrix where a[i][j] = 1, represents a node. in undirected a[i][j] = a[j][i]. lookup/insertion/deletion/updation = O(1). space = O(v^2).
- It could be an adjacency list array of arraylists, where a[i] represents all connections from i vertice. insertion = O(1), lookup/updation/deletion = O(|V| - 1). space = O(V + 2|E|) for undirected and O(V + |E|) for directed.
- basically adjacency list is array of neighbour collections. neighbours could be linked lists, arraylist, or even hashsets.

## Traversals 

### BFS (Breadth First Search):
(Think of fire spreading through the graph)
Create a Queue q for processing vertices, and have a visited, hashset or boolean array to indicate whether element has been viisited or not.

It takes O(m + n) time.

### DFS (Depth First Search):
It finds lexicographic first path in a graph from source vertex u to each vertex. 
(In a tree it finds shortest path)

The idea is to go as deep into the graph as possible and backtrack once you are at a vertex without any unvisited adjacent vertices.

It can be implemented in 2 ways, one is using a stack and the other is using backtracking. Backtracking saves up space.
