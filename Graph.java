import java.io.*;
import java.util.*;

class Graph{
  private String graphName;
  private final List <Edge> edgeList;
  private final List <Vertex> vertexList;
  public List getEdge (List edge) {return edge;}
  public List getVertex (List vertex) {return vertex;}
  public Graph(String mygraphName){
    graphName=myGraphName;
  }
  public void addVertex(String myVertexName, ){
    
    }
  public void addEdge(String myEdgeName, Vertex myVertexstart, Vertex myVertexend){
    Vertex myVertex= new Vertex(myEdgeName, myVertexstart, myVertexend);
    edgeList.add(myVertex);
  }
}
