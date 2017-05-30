import java.util.List;

class Graph{
    private final List <Edge> edgeList;
    private final List <Vertex> vertexList;
    public List getEdge (List edge) {return edge;}
    public List getVertex (List vertex) {return vertex;}

    public Graph(){
	vertexList = new ArrayList<>();
	edgeList = new ArrayList<>();
    }

    /**
     * Adds a Vertex to the graph and connects it to the vertex v
     *
     * @param myVertexName a <code>String</code> value
     * @param v a <code>Vertex</code> value
     */
    public void addVertex(String myVertexName, Vertex v){
	Vertex vertex = new Vertex (myVertexName);
	vertexList.add(vertex);
	vertex.connectToVertex(v);
    }
    
    public void addVertex(String myVertexName, List<Vertex> vertices){
	Vertex vertex = new Vertex (myVertexName);
	vertexList.add(vertex);
	for (Vertex v : vertices)
	    vertex.connectToVertex(v);
    }

    public void addEdge(String myEdgeName, Vertex myVertexstart, Vertex myVertexend){
	Vertex myVertex= new Vertex(myEdgeName, myVertexstart, myVertexend);
	edgeList.add(myVertex);
    }
}
