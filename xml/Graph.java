package xml;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int[][] adjMatrix;
    int vertices;

    Graph(int vertices){
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    public void addVertex(){
        int[][] newMatrix = new int[vertices+1][vertices+1];

        for(int i = 0 ; i < vertices; i++){
            for(int j = 0 ; j < vertices; j++){
                newMatrix[i][j] = adjMatrix[i][j];
            }
        }
        adjMatrix = newMatrix;
        vertices++;
    }

    public void deleteVertex(int vertex){
        int[][] newMatrix = new int[vertices-1][vertices-1];

        for(int i = 0, ni = 0; i < vertices; i++){
            if(i == vertex) continue;
            for(int j = 0, nj = 0; j < vertices; j++){
                if(j == vertex) continue;
                newMatrix[ni][nj++] = adjMatrix[i][j];
            }
            ni++;
        }
        vertices--;
        adjMatrix = newMatrix;
    }

    public void addEdge(int src , int des){
        if(src < 0 || des < 0 || src >= vertices || des >= vertices){
            System.out.println("Invalid index");
            return;
        }
        adjMatrix[src][des] = 1;
        adjMatrix[des][src] = 1;
    }

    public void removeEdge(int src , int des){
        if(src < 0 || des < 0 || src >= vertices || des >= vertices){
            System.out.println("Invalid index");
            return;
        }
        adjMatrix[src][des] = 0;
        adjMatrix[des][src] = 0;
    }

    public void DFS(int start){
        if(start < 0 || start >= vertices) return;
        boolean[] visited = new boolean[vertices];
        visited[start] = true;
        dfshelper(start, visited);
        System.out.println();
    }


    private void dfshelper(int start, boolean[] visited){
        System.out.print(start + "---"); // print node
        for(int i = 0; i < vertices; i++){
            if(adjMatrix[start][i] == 1 && !visited[i]){
                visited[i] = true;
                dfshelper(i, visited);
            }
        }
    }


    public void BFS(int start){
        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(start);
        boolean[] visited = new boolean[vertices];
        int i;

        while(!bfsQueue.isEmpty()){
            i = bfsQueue.poll();
            System.out.print(i + "---");
            visited[i] = true;
            for(int j = 0; j < vertices; j++){
                if(adjMatrix[i][j] == 1 && !visited[j]){
                    bfsQueue.add(j);
                    visited[j] = true;
                }
            }

        }

    }

}
