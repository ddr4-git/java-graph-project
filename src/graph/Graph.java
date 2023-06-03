package graph;

import java.util.ArrayList;


//Model graph

public class Graph {
	
	private int nodes;
	private ArrayList<ArrayList<Lien>> connections;
	
	
	//Fonction de retour d'un graph
	public Graph getGraph()
	{
		return this;
	}
	
	//Fonction de creation de graphe
	public void setGraph(int nodes)
	{
		this.nodes = nodes;
		
		this.connections = new ArrayList<ArrayList<Lien>>(nodes);
		
		for(int i = 0; i < nodes; i++)
		{
			this.connections.add(new ArrayList<Lien>());
		}
	}
	
	//Fonction de retour des connnections d'un node(source)
	public ArrayList<Lien> getLien(int source)
	{
		return this.connections.get(source);
	}
	
	//Fonction d'ajout de lien(connections)
	public void setLien(int source, int destination, int prix)
	{
		check(source, destination);
		Lien lien = new Lien();
		lien.setDestination(destination);
		lien.setPrix(prix);
		
		this.connections.get(source).add(lien);
	}
	
	//Fonction de retour du prix vers une destination
	public int getPrix(int source, int destination)
	{
		check(source, destination);
		return this.connections.get(source).get(destination).getPrix();
	}
	
	//Fonction de saisi du prix vers une destination
	public void setPrix(int source, int destination, int prix)
	{
		check(source, destination);
		this.connections.get(source).get(destination).setPrix(prix);
	}
	
	
	//Fonction de retour du nombre nodes(points)
	public int getNodes()
	{
		return this.nodes;
	}
	
	//Fonction de verfication de la validite des informations
	public void check(int source, int destination)
	{
		if(source == destination)
		{
			return;
		}
	}
}
