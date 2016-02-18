package module3;

//Java utilities libraries
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

//Processing library
import processing.core.PApplet;

//Unfolding libraries
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;

//Parsing library
import parsing.ParseFeed;

/** EarthquakeCityMap
 * An application with an interactive map displaying earthquake data.
 * Author: UC San Diego Intermediate Software Development MOOC team
 * @author luyi
 * Date: July 17, 2015
 * */
public class EarthquakeCityMap extends PApplet {

	// You can ignore this.  It's to keep eclipse from generating a warning.
	private static final long serialVersionUID = 1L;

	// IF YOU ARE WORKING OFFLINE, change the value of this variable to true
	private static final boolean offline = false;
	
	// Less than this threshold is a light earthquake
	public static final float THRESHOLD_MODERATE = 5;
	// Less than this threshold is a minor earthquake
	public static final float THRESHOLD_LIGHT = 4;

	/** This is where to find the local tiles, for working without an Internet connection */
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	// The map
	private UnfoldingMap map;
	
	//feed with magnitude 2.5+ Earthquakes
	private String earthquakesURL = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.atom";

	
	public void setup() {
		size(1250, 600, OPENGL);

		if (offline) {
		    map = new UnfoldingMap(this, 200, 50, 1000, 500, new MBTilesMapProvider(mbTilesString));
		    earthquakesURL = "2.5_week.atom"; 	// Same feed, saved Aug 7, 2015, for working offline
		}
		else {
			map = new UnfoldingMap(this, 200, 50, 1000, 500, new Google.GoogleMapProvider());
			// IF YOU WANT TO TEST WITH A LOCAL FILE, uncomment the next line
			//earthquakesURL = "2.5_week.atom";
		}
		
	    map.zoomToLevel(2);
	    MapUtils.createDefaultEventDispatcher(this, map);	
			
	    // The List you will populate with new SimplePointMarkers
	    List<Marker> markers = new ArrayList<Marker>();

	    //Use provided parser to collect properties for each earthquake
	    //PointFeatures have a getLocation method
	    List<PointFeature> earthquakes = ParseFeed.parseEarthquake(this, earthquakesURL);
	    
	    // add markers to the map
	    for ( PointFeature earthquake: earthquakes) {

	    	markers.add(createMarker(earthquake));
	    	map.addMarkers(markers);
	    }
	    
	    // These print statements show you (1) all of the relevant properties 
	    // in the features, and (2) how to get one property and use it
	    if (earthquakes.size() > 0) {
	    	PointFeature f = earthquakes.get(0);
	    	System.out.println(f.getProperties());
	    	Object magObj = f.getProperty("magnitude");
	    	float mag = Float.parseFloat(magObj.toString());
	    	// PointFeatures also have a getLocation method
	    }
	    
/*	    for (PointFeature earthquake : earthquakes) {
	    	Object magObj = earthquake.getProperty("magnitude");
	    	float mag = Float.parseFloat(magObj.toString());
	    	System.out.println(mag);
	    }
*/
	    // Here is an example of how to use Processing's color method to generate 
	    // an int that represents the color yellow.  
	    // int yellow = color(255, 255, 0);
	    
	    
	    
	    //TODO: Add code here as appropriate
	}

	
	// A suggested helper method that takes in an earthquake feature and 
	// returns a SimplePointMarker for that earthquake
	// TODO: Implement this method and call it from setUp, if it helps
	private SimplePointMarker createMarker(PointFeature feature)
	{
		// finish implementing and use this method, if it helps.
	    int yellow = color(255, 255, 0);
	    int blue = color(0,0,255);
	    int red = color(255,0,0);
	    
		Object magObject = feature.getProperty("magnitude");
		float mag = Float.parseFloat(magObject.toString());
		
		SimplePointMarker mak = new SimplePointMarker(feature.getLocation());
		if ( mag < 4.0) {
			mak.setRadius(5.0f);
			mak.setColor(yellow);
		}
		else if ( mag >= 4.0 && mag < 5.0) {
			mak.setRadius(7.0f);
			mak.setColor(blue);
		}
		else {
			mak.setRadius(10.0f);
			mak.setColor(red);
		}

		return mak;
	}
	
	public void draw() {
	    background(10);
	    map.draw();
	    addKey();
	}


	// helper method to draw key in GUI
	// TODO: Implement this method to draw the key
	private void addKey() 
	{	
		// Remember you can use Processing's graphics methods here

		fill(0,255,255);
		rect(10, 50, 180, 300);

		fill(255,0,0);
		ellipse(30,150,10,10);	
	
		fill(0,0,255);
		ellipse(30,200,7,7);

		fill(255,255,0);
		ellipse(30,250,5,5);
		
		textSize(20);
		fill(0,0,0);
		text("Earthquake Key", 25, 100);
		textSize(16);
		text("5.0+ earthquakes", 42, 156);
		text("4.0+ earthquakes", 42, 206);
		text("below 4.0", 42, 256);

	}
}
