
import java.util.List;
import java.util.ArrayList;
class Vertex{
    private String vertexName;
    private List <Vertex> listVertex;

    public Vertex(String vertexName) {
	this.vertexName = vertexName;
	listVertex = new ArrayList<>();
    }
n
    public String getVertexName() {
	return vertexName;
    }

    public void setVertexName(final String vertexName) {
	this.vertexName = vertexName;
    }

    public List <Vertex> getListVertex() {
	return listVertex;
    }

    public void connectToVertex (Vertex vertex){
	listVertex.add(vertex);
    }

