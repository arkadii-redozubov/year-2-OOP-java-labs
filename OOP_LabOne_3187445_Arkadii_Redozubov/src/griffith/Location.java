//Arkadii Redozubov, 3187445
package griffith;

public class Location {
//	declare encapsulated private attributes
	private double latitude;
	private double longitude;
	
//	constructor, initializes Location attributes 
	public Location(double latitude, double logitude) {
		this.latitude = latitude;
		this.longitude = logitude;
	}

//	Getters
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	

}
