
public class Citygraph {
	public static void main(String[] args) {
		
		// initializes nodes
		Node berlin = new Node("berlin");
		Node leipzig = new Node("leipzig");
		Node weimar = new Node("weimar");
		Node erfurt = new Node("erfurt");
		Node jena = new Node("jena");
		Node nuernberg = new Node("nuernberg");
		Node muenchen = new Node("muenchen");
		Node augsburg = new Node("augsburg");
		Node freiburg = new Node("freiburg");
		Node stuttgart = new Node("stuttgart");
		Node mannheim = new Node("mannheim");
		Node frankfurt = new Node("frankfurt");
		Node wiesbaden = new Node("wiesbaden");
		Node duesseldorf = new Node("duesseldorf");
		Node koeln = new Node("koeln");
		Node essen = new Node("essen");
		Node duisburg = new Node("duisburg");
		Node dortmund = new Node("dortmund");
		Node bremen = new Node("bremen");
		Node hannover = new Node("hannover");
		Node braunschweig = new Node("braunschweig");
		Node eschwege = new Node("eschwege");
		
		
		// initializes graph
		Graph c = new Graph();
		
		
		// adds nodes to nodelist
		c.insertNode (berlin);
		c.insertNode (leipzig);
		c.insertNode (weimar);
		c.insertNode (erfurt);
		c.insertNode (jena);
		c.insertNode (nuernberg);
		c.insertNode (muenchen);
		c.insertNode (augsburg);
		c.insertNode (freiburg);
		c.insertNode (stuttgart);
		c.insertNode (mannheim);
		c.insertNode (frankfurt);
		c.insertNode (wiesbaden);
		c.insertNode (duesseldorf);
		c.insertNode (koeln);
		c.insertNode (essen);
		c.insertNode (duisburg);
		c.insertNode (dortmund);
		c.insertNode (bremen);
		c.insertNode (hannover);
		c.insertNode (braunschweig);
		c.insertNode (eschwege);
		
		
		//adds edges to adjlist
		c.insertEdge(berlin,braunschweig);
		c.insertEdge(berlin,leipzig);
		c.insertEdge(leipzig,weimar);
		c.insertEdge(leipzig,jena);
		c.insertEdge(weimar,jena);
		c.insertEdge(weimar,erfurt);
		c.insertEdge(erfurt,frankfurt);
		c.insertEdge(jena,nuernberg);
		c.insertEdge(nuernberg,frankfurt);
		c.insertEdge(nuernberg,stuttgart);
		c.insertEdge(nuernberg,augsburg);
		c.insertEdge(nuernberg,muenchen);
		c.insertEdge(muenchen,augsburg);
		c.insertEdge(muenchen,freiburg);
		c.insertEdge(augsburg,stuttgart);
		c.insertEdge(freiburg,stuttgart);
		c.insertEdge(freiburg,mannheim);
		c.insertEdge(stuttgart,mannheim);
		c.insertEdge(mannheim,frankfurt);
		c.insertEdge(mannheim,wiesbaden);
		c.insertEdge(frankfurt,wiesbaden);
		c.insertEdge(frankfurt,duesseldorf);
		c.insertEdge(wiesbaden,duesseldorf);
		c.insertEdge(duesseldorf,koeln);
		c.insertEdge(duesseldorf,essen);
		c.insertEdge(koeln,essen);
		c.insertEdge(essen,duisburg);
		c.insertEdge(essen,dortmund);
		c.insertEdge(duisburg,dortmund);
		c.insertEdge(dortmund,bremen);
		c.insertEdge(dortmund,hannover);
		c.insertEdge(bremen,hannover);
		c.insertEdge(hannover,braunschweig);
		c.insertEdge(eschwege,weimar);
		
		
		// removes edge / city
		c.removeEdge (eschwege,weimar);
		c.removeNode (eschwege);
		
		
		//prints adjacency list of graph
		c.getAdjacencyOfGraph();
		
		
	}
}
