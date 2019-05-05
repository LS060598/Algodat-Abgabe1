import java.util.*;
import java.lang.StringBuilder;

public class Node {
	
	private String City;
	private Vector<Node> adjlist; //Adjacency list
	
	//constructor
	public Node(String city){
		City = city;
		adjlist = new Vector<Node>();
	}
	
	
	// set city
	public void setNode(String city) { 
		this.City = city;
	}
	
	// get city
	public String getNode() { 
		return City;
	}
	
	//adds edge
	public void addToAdjacency(Node n){
		adjlist.add(n);
	}
	
	//removes edge
	public boolean removeFromAdjacency(Node n){
		if(adjlist.contains(n)) {
			adjlist.remove(n);
			return true;
		}
		return false;
	}
	
	//creates adjacency list String
	public String printAdjacency() {
		StringBuilder sb = new StringBuilder(""); 
		for(Node n : adjlist)
			sb.append(n.getNode()+",");
		
		sb.deleteCharAt(sb.length()-1);
		sb.append("");
		return sb.toString();
	}


	
	

}
