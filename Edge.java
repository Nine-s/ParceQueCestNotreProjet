import java.io.*;
import java.util.*;

class Edge{
  private String edgeName;
  private Vertex start;
  private Vertex end;
  public Vertex setVertexStart(){return start;}
  public Vertex setVertexEnd(){return end;}
  public String getVertexName(){return edgeName;}
  public void setVertexStart(Vertex myStart){start=myStart;}
  public void setVertexEnd(Vertex myEnd){end=myEnd;}
  public void setVertexName(String myName){edgeName=myName;}
  public Edge(String myEdgeName, Vertex myStart, Vertex myEnd){
    start=myStart;
    end=myEnd;
    edgeName=myName;
  }
}
