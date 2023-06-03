package graph;

import java.util.ArrayList;

public class GraphController {
	
	Graph model;
	GraphView view;
	
	public GraphController(Graph model, GraphView view)
	{
		this.model = model;
		this.view = view;
	}
	
	public void addLien(int source, int destination, int prix)
	{
		this.model.setLien(source, destination, destination);
	}
	
	public ArrayList<Lien> getLien(int source)
	{
		return this.model.getLien(source);
	}
	
	public void updateView()
	{
		view.viewGraph(model);
	}

}
