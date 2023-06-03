package graph;

public class GraphView {
	
	//Affiche le graphe
	void viewGraph(Graph graph)
	{
		for(int i = 0; i < graph.getNodes(); i++)
		{
			System.out.println("point " + i + ": ");
			for(Lien lien : graph.getLien(i))
			{
				System.out.println("\t lien vers: " + lien.getDestination() + " --- prix: " + lien.getCost());
			}
			System.out.println();
		}
	}

}
