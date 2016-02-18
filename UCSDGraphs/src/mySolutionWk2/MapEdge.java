package mySolutionWk2;

import geography.GeographicPoint;
	/**
	 * 
	 * @author Luyi 
	 * A class which represents the edges between the vertices
	 *
	 */
public class MapEdge {
	
	// member variables
	private GeographicPoint start;
	private GeographicPoint end;
	private String streetName;
	private String roadType;
	private double distance;
	
	// create a new edge
	public MapEdge(MapNode a, MapNode b, String sName, String roadType) {
		this.start = a.getLocation();
		this.end = b.getLocation();
		this.streetName = sName;
		this.distance = this.start.distance(this.end);
		this.roadType = roadType;
	}
	
	// create a new edge with length provided
	public MapEdge(MapNode a, MapNode b, String sName,String roadType, double d) {
		this.start = a.getLocation();
		this.end = b.getLocation();
		this.streetName = sName;
		this.roadType = roadType;
		this.distance = d;
	}
	

	// get street name of the edge
	public String getEdgeName() {
		return streetName;
	}
	
	// get road type
	public String getEdgeType() {
		return roadType;
	}
	
	// get the distance
	public double getDistance() {
		return distance;
	}
	
	// print out this edge
	public void printEdge() {
		System.out.println("From: " + start.toString() + " to " + end.toString() + " StreetName: " + getEdgeName() +" "+ getEdgeType() +" "+ Math.round(getDistance()));
	}
}
