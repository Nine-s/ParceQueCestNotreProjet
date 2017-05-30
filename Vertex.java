
import java.util.List;
import java.util.ArrayList;
class Vertex{
    private String vertexName;
    private List <Vertex> listVertex;

    public Vertex(String vertexName) {
	this.vertexName = vertexName;
	listVertex = new ArrayList<>();
    }

    public String getVertexName() {
	return vertexName;
    }

    public void setVertexName(final String vertexName) {
	this.vertexName = vertexName;
    }

    public List <Vertex> getListVertex() {
	return listVertex;
    }
    

    
    /**
     *  <code>connectToVertex</code> connects a Vertex with another one. 
     *
     * @param vertex A vertex to connect to the current one.
     */
    public void connectToVertex (Vertex vertex){
	listVertex.add(vertex);
    }

}
