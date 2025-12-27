# Graphs

##Implementation of Graphs
It could be an adjacency matrix where a[i][j] = 1, represents a node. in undirected a[i][j] = a[j][i]. lookup/insertion/deletion/updation = O(1). space = O(v^2).
It could be an adjacency list array of arraylists, where a[i] represents all connections from i vertice. insertion = O(1), lookup/updation/deletion = O(|V| - 1). space = O(V + 2|E|) for undirected and O(V + |E|) for directed.
basically adjacency list is array of neighbour collections. neighbours could be linked lists, arraylist, or even hashsets.
