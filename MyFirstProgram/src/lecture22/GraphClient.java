package lecture22;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addvertex("A");
		graph.addvertex("B");
		graph.addvertex("C");
		graph.addvertex("D");
		graph.addvertex("E");
		graph.addvertex("F");
		graph.addvertex("G");
		
		System.out.println(graph.numvtces());
	//	System.out.println(graph.numEdges());
		
		graph.addEdges("A", "B", 10);
		graph.addEdges("A", "D", 40);
		graph.addEdges("B", "C", 10);
		graph.addEdges("B", "A", 10);
		graph.addEdges("c", "D", 10);
		graph.addEdges("D", "E", 2);
		graph.addEdges("E","F", 8);
		graph.addEdges("F","G", 40);
		graph.addEdges("E","G", 40);
		System.out.println(graph.numEdges());
		graph.display();
        graph.removeVertex("A");
        graph.display();
        
        System.out.println(graph.h);
        
	}

}
