import java.util.*;
public class Graph {
	
	private Vector<Node> nodelist_;//list of city names
	
	
	//constructors
	public Graph(){
		nodelist_ = new Vector<Node>();
	}
	
	public Graph(Vector<Node> nodelist){
		nodelist_ = new Vector<Node>(nodelist);
	}
	
	
	// getter / setter
	public Graph getNode() { 
		return this;
	}
	
	public void setGraph(Vector<Node> nodelist){
		nodelist_ = nodelist;		
	}
	
	
	// inserts city
	public void insertNode (Node x) { 
		nodelist_.add(x);
		//System.out.println("inserted city"+"\t"+x.getNode()); // to much if it is printed for each city 
	}
	

	// removes city
	public void removeNode (Node x) { 
		nodelist_.remove(x);
		System.out.println("removed City"+"\t"+x.getNode()+"\t");
	}
	

	// inserts edge
	public boolean insertEdge(Node x, Node y) { 
		if(nodelist_.contains(x)&&nodelist_.contains(y)) {
			x.addToAdjacency(y); // insert y in adjacency list of x
			y.addToAdjacency(x); //insert x in '' of y
			//System.out.println("inserted edge"+"\t"+x.getNode()+"-"+y.getNode()); // to much if it is printed for each edge
			return true;
		}
		return false;
	}
	
	
	// removes edge
	public boolean removeEdge (Node x, Node y) { 
		if (nodelist_.contains(x)) {
			boolean b = false; 
				b = x.removeFromAdjacency(y);
				b = y.removeFromAdjacency(x);
				System.out.println("removed edge"+ "\t" + x.getNode()+ "-" + y.getNode());
				return 	b;
		}
		return false;
	}
	
	
	// gets adjacency list of graph
	void getAdjacencyOfGraph() {
		System.out.println("Adjacencylist of Graph :");
		for(Node x : nodelist_)
			System.out.println(x.getNode() +" -> "+ x.printAdjacency());
	}
}

