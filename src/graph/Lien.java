package graph;

//Model lien

public class Lien {
	
	private int destination;
	private int cost;
	
	//Retourne un destination
	public int getDestination()
	{
		return destination;
	}
	
	//Set une destination
	public void setDestination(int destination)
	{
		this.destination = destination;
	}
	
	
	//Retourne le prix vers cette destination
	public int getCost()
	{
		return this.cost;
	}
	
	
	//Set le prix vers une destination
	public void setCost(int cost)
	{
		this.cost = cost;
	}

}
