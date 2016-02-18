package roadgraph;

import java.util.List;
import java.util.LinkedList;
import geography.GeographicPoint;
	/**
	 *	a class which represents the vertices within a graph,
	 *	including the location, the edges, and neighbours of each vertex
	 */
public class MapNode {
	// member variables
	// @param location The latitude and longitude of this MapNode
	private GeographicPoint location;
	private List<MapEdge> edges;
	private List<MapNode> neighbours;
	private double current;
	
	
	// Create a new MapNode
	public MapNode(GeographicPoint location) {
		this.location = location;
		edges = null;
		List<MapEdge> e = new LinkedList<MapEdge>();
		this.edges = e;
		List<MapNode> n = new LinkedList<MapNode>();
		this.neighbours = n;
		
	}
	
	public double getCurrentDist() {
		return current;
	}
	
	public double setCurrentDist(double d) {
		this.current = d;
		return current;
	}
	
	// get neighbors
	public List<MapNode> getNeighbors() {
		return neighbours;
	}
	
	// get location of this MapNode
	public GeographicPoint getLocation() {
		return location;
	}
	
	// get edges of the MapNode
	public List<MapEdge> getEdges() {
		return edges;
	}
	
	// add the edge to this MapNode
	public void addNodeEdge(MapNode node, String name,String type, double dis) {
		MapEdge newEdge = new MapEdge(this, node, name,type, dis);
		if ( newEdge != null) {
			this.edges.add(newEdge);
			this.neighbours.add(node);
		}
	}
	
	// for review the graph, print all the edges of this MapNode
	public void printEdges() {
		for ( int i = 0; i < edges.size(); i++ ) {
			edges.get(i).printEdge();
		}
	}
	
	public String toString() {
		return location.toString();
	}
}
