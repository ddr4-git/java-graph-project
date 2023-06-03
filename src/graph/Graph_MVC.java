package graph;

public class Graph_MVC {

	public static void main(String[] args)
	{
		Graph model = getData();
		GraphView view = new GraphView();
		
		GraphController controller = new GraphController(model, view);
		controller.updateView();
	}
	
	
	public static Graph getData()
	{
		Graph graph = new Graph();
		graph.setGraph(4);
		
		graph.setLien(0, 2, 1);
		graph.setLien(0, 1, 0);
		graph.setLien(1, 3, 3);
		graph.setLien(2, 0, 6);
		graph.setLien(3, 2, 9);
		graph.setLien(3, 1, 10);
		
		graph.addNode();
		graph.setLien(4, 0, 9);
		graph.setLien(4, 4, 18);
		return graph;
		
	}
}
