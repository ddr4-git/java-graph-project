package graph;

//Model lien

public class Lien {
	
	private int destination;
	private int prix;
	
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
	public int getPrix()
	{
		return this.prix;
	}
	
	
	//Set le prix vers une destination
	public void setPrix(int prix)
	{
		this.prix = prix;
	}

}
